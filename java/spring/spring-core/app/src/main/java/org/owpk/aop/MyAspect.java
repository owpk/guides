package org.owpk.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* transfer(..))")
    private void transferPointcut() { }

    @Before("transferPointcut()")
    public void callBefore(JoinPoint jp) {
        System.out.println("ASPECT ARGS: " + Arrays.toString(jp.getArgs()));
        System.out.println("ASPECTJ MSG: TRANSFER METHOD WAS EXECUTED");
    }

    @After("transferPointcut()")
    public void callAfter(JoinPoint jp) {
        System.out.println("ASPECTJ MSG: TRANSFER METHOD WAS EXECUTED");
    }

    @Pointcut("@annotation(MyAspectAnnotation) && args(..,user)")
    private void annotationPointcut(User user) { }

    @After("annotationPointcut(user)")
    public void afterAnnotationPointcut(JoinPoint jp, User user) {
        System.out.println("ASPECTJ MSG WITH ANNOTATION: " + Arrays.toString(jp.getArgs()) + " : " + user);
    }

    @Around("annotationPointcut(user)")
    public Object aroundAnnotationPointcut(ProceedingJoinPoint jp, User user) throws Throwable {
        System.out.println("ASPECTJ MSG WITH ANNOTATION: " + Arrays.toString(jp.getArgs()) + " : " + user);
        if (user.getName().equals("")) {
            user.setName("Named");
            return jp.proceed();
        }
        return null;
    }
}
