package com.chinawiserv.core.exception;

import com.chinawiserv.core.response.ResultBody;
import com.chinawiserv.core.response.ResultGenerator;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sungang on 2017/12/4.
 */
@RestController
public class AppErrorUrlController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ResultBody error() {
        return ResultGenerator.genFailResult("500","请求不合法");
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
