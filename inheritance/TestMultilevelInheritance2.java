class Person {
   public void eat() {
       System.out.println("The person eats");
   }
}

class Employee extends Person {
   public void work() {
       System.out.println("The employee works");
   }
}

class Manager extends Employee {
   public void manage() {
       System.out.println("The manager manages");
   }
}

public class TestMultilevelInheritance2 {
   public static void main(String[] args) {
       Manager manager = new Manager();
       manager.eat();
       manager.work();
       manager.manage();
   }
}
