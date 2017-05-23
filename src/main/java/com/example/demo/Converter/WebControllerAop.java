package com.example.demo.Converter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by wangjinzhao on 2017/5/23.
 */
@Aspect
@Component
public class WebControllerAop {
    @Around("execution(* com.example.demo.web.HelloController.*(..))")
    public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("环绕通知的目标方法名："+proceedingJoinPoint.getSignature().getName());
        try {
            int param1 = Integer.parseInt(proceedingJoinPoint.proceed().toString());
            return String.valueOf(param1+1);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
