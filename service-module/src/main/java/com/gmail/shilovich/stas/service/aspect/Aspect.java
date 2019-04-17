package com.gmail.shilovich.stas.service.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    private static final Logger logger = LogManager.getLogger(Aspect.class);

    @Pointcut("execution(public * com.gmail.shilovich.stas.service.*(..))")
    public void callAllPublic() {
    }

    @Before("callAllPublic()")
    public void beforeCallAllPublic(JoinPoint jp) {
        String args = Arrays.stream(jp.getArgs())
                .map(a -> a.toString())
                .collect(Collectors.joining(","));
        logger.info("before" + jp.toShortString() + ", args=[" + args + "]");
    }

    @After("callAllPublic()")
    public void afterCallAllPublic(JoinPoint jp) {
        logger.info("after " + jp.toShortString());
    }
}
