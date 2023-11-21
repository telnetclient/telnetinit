public class OverloadDemo {
   // Method that takes one integer parameter
   public void display(int a) {
       System.out.println("Displaying integer: " + a);
   }

   // Method that takes one string parameter
   public void display(String s) {
       System.out.println("Displaying string: " + s);
   }

   // Method that takes two integer parameters
   public void display(int a, int b) {
       System.out.println("Displaying two integers: " + a + ", " + b);
   }

   public static void main(String[] args) {
       OverloadDemo demo = new OverloadDemo();

       // Calling the method with one integer parameter
       demo.display(10);

       // Calling the method with one string parameter
       demo.display("Hello");

       // Calling the method with two integer parameters
       demo.display(20, 30);
   }
}

