package com.example.note.system.pointcut;

import com.example.note.system.anotation.TestAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/7/2 9:39
 */
@Component
@Aspect
@Slf4j
public class TestPointcut {

    @Pointcut(value = "@annotation(com.example.note.system.anotation.TestAnnotation)")
    public void access() {
    }

    @Before("access() && @annotation(cc)")
    public void doBefore(JoinPoint joinPoint, TestAnnotation cc){
         log.info("AOP 前"+cc);
    }

    @AfterReturning(value = "access() && @annotation(anc)", returning = "rst")
    public void sendKafkaTopic(JoinPoint joinPoint, Object rst, TestAnnotation anc){
        log.info("AOP 后");
    }
}