package com.devx.core.exception;


import com.devx.core.enums.ErrorInfo;

/**
 * 业务处理异常
 * Created by sungang on 2017/3/29.
 */
public class BusinessException extends Exception {

    private ErrorInfo errorInfo;
    private Object[] args;

    public BusinessException(ErrorInfo errorInfo, Object... agrs) {
        this.errorInfo = errorInfo;
        this.args = agrs;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }


    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }
}
