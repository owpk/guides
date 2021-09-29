package org.owpk;

public class B extends A {
    public static String a = "sad";
    static {
        System.out.println("static B");
    }

    {
        System.out.println("non static B");
    }

    public B() {
        System.out.println("cons B");
    }
    public void m() {
        System.out.println("asd");
        NaAbs abs = new NaAbs() {};
    }

}
