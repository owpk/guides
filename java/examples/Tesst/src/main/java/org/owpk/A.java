package org.owpk;

import java.util.Comparator;

public class A extends Player {
    private static String a;
    private String b;

    class AA {
        void ab() {
            System.out.println(a);
            int age = A.this.getAge();
            System.out.println(b);
        }
    }

    static class SAA implements Comparable<SAA> {

        void abb() {
            System.out.println(a);
        }

        @Override
        public int compareTo(SAA o) {
            return 0;
        }
    }

    static {
        System.out.println("static A");
    }
    {
        System.out.println("non static A");
    }

    public A() {
        System.out.println("cons A");
    }

    public static void meth() {

    }
}
