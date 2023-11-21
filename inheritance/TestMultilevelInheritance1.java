class Animal {
   public void eat() {
       System.out.println("The animal eats");
   }
}

class Dog extends Animal {
   public void bark() {
       System.out.println("The dog barks");
   }
}

class Puppy extends Dog {
   public void weep() {
       System.out.println("The puppy weeps");
   }
}

public class TestMultilevelInheritance1 {
   public static void main(String[] args) {
       Puppy puppy = new Puppy();
       puppy.eat();
       puppy.bark();
       puppy.weep();
   }
}

