package org.owpk;

import java.io.*;

class DeepCloning extends Player.Switcher {
    protected final String a = "a";

    public DeepCloning(Player player, int range) {
        player.super(range);
    }

    public static void main(String... args) {
        org.owpk.C b = new org.owpk.C();
        b.m();
//        A a = new A();
//        try (ByteArrayOutputStream bOut = new ByteArrayOutputStream(); ObjectOutputStream objOut = new ObjectOutputStream(bOut)) {
//            objOut.writeObject(a);
//            ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(bOut.toByteArray()));
//            A serialized = (A) objIn.readObject();
//            objIn.close();
//            System.out.println(serialized);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    static class A implements Serializable {
        B b;
        A() {
            this.b = new B();
        }

        @Override
        public String toString() {
            return "A{" +
                    "b=" + b +
                    '}';
        }
    }

    static class B implements Serializable {
        C c;
        B() {
            c = new C();
        }

        @Override
        public String toString() {
            return "B{" +
                    "c=" + c +
                    '}';
        }
    }

    static class C implements Serializable {
        String o = "o";

        @Override
        public String toString() {
            return "C{" +
                    "o='" + o + '\'' +
                    '}';
        }
    }
}