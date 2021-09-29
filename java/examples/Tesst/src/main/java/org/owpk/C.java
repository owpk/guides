package org.owpk;

public class C extends B {

    static {
        System.out.println("static C");
    }

    {
        System.out.println("non static C");
    }

    public C() {
        System.out.println("cons C");
    }
    public void m() {
        System.out.println("asd");
    }
}
