package com.example.playground.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Vorobyev Vyacheslav
 */
@Component
public class SecondBean {

    private final ThirdBean thirdBean;

    public SecondBean(@Lazy ThirdBean thirdBean) {
        this.thirdBean = thirdBean;
    }

    public void foo() {
        thirdBean.hello();
    }
}
