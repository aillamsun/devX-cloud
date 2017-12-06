package com.devx.api.interceptor;

import com.lorne.tx.springcloud.interceptor.TxManagerInterceptor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by sungang on 2017/12/6.
 */
@Aspect
@Component
public class TransactionInterceptor implements Ordered {

    @Override
    public int getOrder() {
        return 1;
    }
    @Autowired
    private TxManagerInterceptor txManagerInterceptor;

    @Around("execution(* com.devx.api.service.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        return txManagerInterceptor.around(point);
    }
}
