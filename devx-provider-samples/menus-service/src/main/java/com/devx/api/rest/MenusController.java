package com.devx.api.rest;

import com.devx.core.web.controller.BaseCRUDController;
import com.devx.model.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sungang on 2017/12/6.
 */
@RestController
@RequestMapping("menus")
public class MenusController extends BaseCRUDController<Menu>{
}
