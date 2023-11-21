abstract class Shape {
double dim1;
double dim2;
Shape(double a, double b) {
dim1 = a;
dim2 = b;
}
// area is now an abstract method
abstract double area();
}
class Rectangle extends Shape {
Rectangle(double a, double b) {
super(a, b);
}
// override area for rectangle
double area() {

System.out.println("Inside Area for Rectangle.");
return dim1 * dim2;
}
}
class Triangle extends Shape {
Triangle(double a, double b) {
super(a, b);
}
// override area for right triangle
double area() {
System.out.println("Inside Area for Triangle.");
return dim1 * dim2 / 2;
}
}
class AbstractClassEg {
public static void main(String args[]) {
//Shape s = new Shape(10, 10); // illegal now
Rectangle r = new Rectangle(9, 5);
Triangle t = new Triangle(10, 8);
Shape shaperef; // this is OK, no object is created
shaperef = r;
System.out.println("Area is " + shaperef.area());
shaperef = t;
System.out.println("Area is " + shaperef.area());
}
}