package com.devx.core.utils;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by u_zhouzh on 2017/9/16.
 */
public class BeanUtils {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null){
            return null;
        }


        Object obj = beanClass.newInstance();

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if(Modifier.isStatic(mod) || Modifier.isFinal(mod)){
                continue;
            }
            if( !map.containsKey( field.getName() ) )
                continue;

//            logger.debug("设置【" + field.getName() + "=" + map.get(field.getName()) + "】");
//            logger.debug( field.getType().getSimpleName() );
            field.setAccessible(true);

            field.set(obj, ConvertUtils.convert( map.get(field.getName()), field.getType() ) );
        }

        return obj;
    }

    public static Example mapToExample(Map<String, Object> map, Class<?> beanClass) throws Exception {
        Example example = new Example( beanClass );
        if (map == null)
            return example;

        Example.Criteria criteria = example.createCriteria();
        Object obj = beanClass.newInstance();

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if(Modifier.isStatic(mod) || Modifier.isFinal(mod)){
                continue;
            }
            if( !map.containsKey( field.getName() ) )
                continue;
            if( field.getType() == String.class ) {
                String value = ConvertUtils.convert(map.get(field.getName()), String.class).toString();
                value = "%" + value + "%";
                criteria.andLike(field.getName(), value );
            } else {
                criteria.andEqualTo(field.getName(), ConvertUtils.convert(map.get(field.getName()), field.getType()));
            }
        }

        if( map.containsKey("sortField") && map.containsKey("sortOrder") ) {
            if( "asc".equalsIgnoreCase( map.get( "sortOrder" ).toString() ) )
                example.orderBy( map.get("sortField").toString() ).asc();
            else
                example.orderBy( map.get("sortField").toString() ).desc();
        }

        return example;
    }

    /**
     * 对象转Map
     * @param obj
     * @return
     * @throws Exception
     */
    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        return objectToMap( obj, null, true );
    }

    /**
     * 对象转Map
     * @param obj
     * @param fields
     * @return
     * @throws Exception
     */
    public static Map<String, Object> objectToMap(Object obj, String[] fields, boolean exclude ) throws Exception {
        if(obj == null){
            return new HashMap<String, Object>();
        }

        Map<String, Boolean> fieldsMap = new HashMap<String, Boolean>();
        if( fields != null ) {
            for( String field : fields ) {
                fieldsMap.put( field, true );
            }
        }

        Map<String, Object> map = new HashMap<String, Object>();
        if( obj instanceof Map ) {  //如果是MAP
            Map<String, Object> tmpMap = (Map)obj;
            for( Map.Entry<String,Object> entry : tmpMap.entrySet() ) {
                String name = entry.getKey();
                if (fieldsMap.size() > 0) {
                    if (exclude && fieldsMap.containsKey(name)) //去掉不包含的字段
                        continue;
                    else if (!exclude && !fieldsMap.containsKey(name))  //去掉不包含的字段
                        continue;
                }
                map.put( entry.getKey(), entry.getValue() );
            }
        } else {    //如果是对象
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                String name = field.getName();
                if (fieldsMap.size() > 0) {
                    if (exclude && fieldsMap.containsKey(name)) //去掉不包含的字段
                        continue;
                    else if (!exclude && !fieldsMap.containsKey(name))  //去掉不包含的字段
                        continue;
                }

                field.setAccessible(true);
                map.put(field.getName(), field.get(obj));
            }
        }

        return map;
    }

    /**
     * 对象列表转Map列表
     * @param list
     * @return
     * @throws Exception
     */
    public static List<Map<String, Object>> objectsToMapList(List list ) throws Exception {
        return objectsToMapList( list, null, true );
    }

    /**
     * 对象列表转Map列表
     * @param list
     * @param fields
     * @param exclude
     * @return
     * @throws Exception
     */
    public static List<Map<String, Object>> objectsToMapList(List list, String[] fields, boolean exclude ) throws Exception {
        List<Map<String, Object>> result = new LinkedList<>();
        if( list != null ) {
            for (Object o : list) {
                Map<String, Object> map = objectToMap(o, fields, exclude);
                result.add(map);
            }
        }
        return result;
    }

    /**
     * 对象转字符串
     * @param obj
     * @return
     * @throws Exception
     */
    public static String objectToString(Object obj) throws Exception {
        if(obj == null){
            return "";
        }

        Map<String, Object> map = new HashMap<String, Object>();

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }

        String result = obj.getClass().getSimpleName() + ":";
        for( Map.Entry<String, Object> entry : map.entrySet() ) {
            result += entry.getKey();
            result += "=";
            result += ConvertUtils.convert(entry.getValue(), String.class);
            result += ",";
        }

        return result;
    }

    /**
     * 将列表装载到map
     * @param list
     * @return
     * @throws Exception
     */
    public static Map<String, Object> put2Map(List list) throws Exception {
        return put2Map(list, "id", "getId");
    }

    public static Map<String, Object> put2Map(List list, String key, String methodName ) throws Exception {
        Map<String, Object> result = new HashMap<>();
        if( list == null )  return result;
        Object entity = list.get(0);
        Method method = null;
        if( !( entity instanceof Map ) ) {  //检查是不是map
            method = entity.getClass().getMethod(methodName);
            if (method == null) return result;
        }

        for( Object o : list ) {
            String value = "";
            if( o instanceof Map ) {    //如果是map,则直接取ID
                Map<String, Object> map = (HashMap)o;
                if( !map.containsKey(key) ) continue;
                value = map.get(key).toString();
            } else {
                value = method.invoke(o).toString();
            }
            if(StringUtils.isEmpty( value ) )
                continue;
            result.put(value, o);
        }

        return result;
    }
}
