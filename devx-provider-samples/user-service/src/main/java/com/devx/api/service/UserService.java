package com.devx.api.service;

import com.devx.core.service.BaseService;
import com.devx.mapper.UserMapper;
import com.devx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2017/12/6.
 */
@Service
public class UserService extends BaseService<User> {

    @Autowired
    private UserMapper userMapper;


}
