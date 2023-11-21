interface Interface1 {
   void method1();
}

interface Interface2 {
   void method2();
}

public class MyClass implements Interface1, Interface2 {
   public void method1() {
       System.out.println("Implementation of method1");
   }

   public void method2() {
       System.out.println("Implementation of method2");
   }
}

public class Main {
   public static void main(String[] args) {
       MyClass obj = new MyClass();
       obj.method1();
       obj.method2();
   }
}
