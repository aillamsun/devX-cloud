package com.devx.api.service;

import com.devx.core.service.BaseService;
import com.devx.mapper.RoleMapper;
import com.devx.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2017/12/6.
 */
@Service
public class RoleService extends BaseService<Role> {

    @Autowired
    private RoleMapper roleMapper;
}
