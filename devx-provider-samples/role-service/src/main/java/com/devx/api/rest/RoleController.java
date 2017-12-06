package com.devx.api.rest;

import com.devx.api.service.RoleService;
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
@RequestMapping("role")
public class RoleController extends BaseCRUDController<User> {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResultBody getRoles() {
        List<Role> roles = roleService.selectAll();
        return ResultGenerator.genSuccessResult(roles);
    }
}
