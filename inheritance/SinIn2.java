class Vehicle {
   void run() {
       System.out.println("Running...");
   }
}

class Car extends Vehicle {
   void honk() {
       System.out.println("Honking...");
   }
}

public class SinIn2 {
   public static void main(String[] args) {
       Car car = new Car();
       car.run();
       car.honk();
   }
}
