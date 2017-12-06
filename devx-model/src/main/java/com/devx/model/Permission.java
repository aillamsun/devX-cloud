package com.devx.model;

import com.devx.core.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Permission  extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    /**
     * 是否保存 用于页面用户分配权限选择后，该数据是否保存数据，主要是父节点如果 有自己节点数据的时候  父节点只是用于显示 不做数据保存 0 不保存 1 保存。默认是 1   主要应用于type = 1的 功能权限的时候 其他类型都是1
     */
    @Column(name = "is_save")
    private Integer isSave;

    /**
     * 1 功能权限 2 菜单权限 3 ALL
     */
    private Integer type;

    private String pid;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 授权链接
     */
    @Column(name = "permission_url")
    private String permissionUrl;

    private String description;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 1 可用 0 不可用
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否保存 用于页面用户分配权限选择后，该数据是否保存数据，主要是父节点如果 有自己节点数据的时候  父节点只是用于显示 不做数据保存 0 不保存 1 保存。默认是 1   主要应用于type = 1的 功能权限的时候 其他类型都是1
     *
     * @return is_save - 是否保存 用于页面用户分配权限选择后，该数据是否保存数据，主要是父节点如果 有自己节点数据的时候  父节点只是用于显示 不做数据保存 0 不保存 1 保存。默认是 1   主要应用于type = 1的 功能权限的时候 其他类型都是1
     */
    public Integer getIsSave() {
        return isSave;
    }

    /**
     * 设置是否保存 用于页面用户分配权限选择后，该数据是否保存数据，主要是父节点如果 有自己节点数据的时候  父节点只是用于显示 不做数据保存 0 不保存 1 保存。默认是 1   主要应用于type = 1的 功能权限的时候 其他类型都是1
     *
     * @param isSave 是否保存 用于页面用户分配权限选择后，该数据是否保存数据，主要是父节点如果 有自己节点数据的时候  父节点只是用于显示 不做数据保存 0 不保存 1 保存。默认是 1   主要应用于type = 1的 功能权限的时候 其他类型都是1
     */
    public void setIsSave(Integer isSave) {
        this.isSave = isSave;
    }

    /**
     * 获取1 功能权限 2 菜单权限 3 ALL
     *
     * @return type - 1 功能权限 2 菜单权限 3 ALL
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1 功能权限 2 菜单权限 3 ALL
     *
     * @param type 1 功能权限 2 菜单权限 3 ALL
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取请求方法
     *
     * @return method - 请求方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置请求方法
     *
     * @param method 请求方法
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取授权链接
     *
     * @return permission_url - 授权链接
     */
    public String getPermissionUrl() {
        return permissionUrl;
    }

    /**
     * 设置授权链接
     *
     * @param permissionUrl 授权链接
     */
    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取1 可用 0 不可用
     *
     * @return status - 1 可用 0 不可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1 可用 0 不可用
     *
     * @param status 1 可用 0 不可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}