public class Person {
   String name;
   int age;

   // Parameterized constructor
   public Person(String name, int age) {
       this.name = name;
       this.age = age;
   }

   public static void main(String[] args) {
       // Create a new Person object using the parameterized constructor
       Person person = new Person("John Doe", 30);

       // Print out the person's name and age
       System.out.println("Name: " + person.name);
       System.out.println("Age: " + person.age);
   }
}
