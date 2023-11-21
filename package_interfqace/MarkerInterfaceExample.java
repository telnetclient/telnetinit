// Marker Interface
interface MyMarkerInterface {
 // This interface has no methods
}
// Class implementing the marker interface
class MyClass implements MyMarkerInterface {
 // Class implementation
 public void doSomething() {
 System.out.println("Doing something in MyClass");
 }
}
// Another class implementing the marker interface
class AnotherClass implements MyMarkerInterface {

 // Class implementation
 public void doSomethingElse() {
 System.out.println("Doing something else in AnotherClass");
 }
}
public class MarkerInterfaceExample {
 public static void main(String[] args) {
 MyClass myClass = new MyClass();
 AnotherClass anotherClass = new AnotherClass();
 // Check if the objects implement the marker interface
 if (myClass instanceof MyMarkerInterface) {
 myClass.doSomething();
 }
 if (anotherClass instanceof MyMarkerInterface) {
 anotherClass.doSomethingElse();
 }
 }
}