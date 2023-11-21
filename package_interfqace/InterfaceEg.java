interface Drawable{
void draw();
int a=10;
}
class Rectangle implements Drawable
{
public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
public void draw(){System.out.println("drawing circle");}
}
class InterfaceEg{
public static void main(String args[]){
Drawable d=new Circle();
d.draw();
}}