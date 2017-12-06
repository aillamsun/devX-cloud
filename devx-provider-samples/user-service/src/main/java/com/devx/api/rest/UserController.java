package com.devx.api.rest;

import com.alibaba.fastjson.JSONObject;
import com.devx.api.feign.RoleFeignClient;
import com.devx.api.service.UserService;
import com.devx.core.response.ResultBody;
import com.devx.core.response.ResultGenerator;
import com.devx.core.web.controller.BaseCRUDController;
import com.devx.model.Role;
import com.devx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sungang on 2017/12/6.
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseCRUDController<User> {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleFeignClient roleFeignClient;

    @GetMapping
    public ResultBody getUsers() {
        List<User> users = userService.selectAll();
//        List<Role> roles = roleFeignClient.getRoles();
//        JSONObject jo = new JSONObject();
//        jo.put("users",users);
//        jo.put("roles",roles);
//        JSONObject res = new JSONObject();
//        res.put("data",jo);
        return ResultGenerator.genSuccessResult(users);
    }
}
