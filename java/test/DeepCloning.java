class DeepCloning {
   public static void main(Stirng... args) {
      A a = new A();

   }

   static class A {
      B b;

      A() {
         this.b = new B();
      }
   }

   static class B {
      C c;
      B() {
         c = new C();
      }
   }

   static class C {
      String o = "o";
   }
}
