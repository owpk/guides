package org.owpk.aop;

import org.springframework.stereotype.Component;

@Component
public class SomeClass {

    public void transfer(String someArgs) {
        System.out.println(getClass() + ": TRANSFER: " + someArgs);
    }

    @MyAspectAnnotation
    public void hello(String args, User user) {
        System.out.println(getClass() + ": Hello: " + args + " : " + user);
    }
}
