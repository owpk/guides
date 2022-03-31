package com.example.playground.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Vorobyev Vyacheslav
 */
@Component
public class ThirdBean {

    private final SecondBean secondBean;

    public ThirdBean(@Lazy SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public void bar() {
        System.out.println("bar");
        secondBean.foo();
    }

    public void hello() {
        System.out.println("HELLO");
    }
}
