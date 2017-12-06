package com.devx.api.feign;

import com.devx.api.config.MyConfiguration;
import com.devx.model.Role;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by sungang on 2017/12/6.
 */
@FeignClient(name = "role", configuration = MyConfiguration.class, fallback = RoleFeignClientHystric.class)
public interface RoleFeignClient {

    @RequestMapping(value = "role", method = RequestMethod.GET)
    List<Role> getRoles();
}
