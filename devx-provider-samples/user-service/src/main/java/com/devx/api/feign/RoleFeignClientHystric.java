package com.devx.api.feign;

import com.devx.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sungang on 2017/12/6.
 */
@Component
public class RoleFeignClientHystric implements RoleFeignClient{


    @Override
    public List<Role> getRoles() {
        System.out.println("进入断路器-list。。。");
        return null;
    }
}
