//using super keyword for accessing variables
class SuperEgForMethod
{
public static void main(String args[])
{
child c=new child();
c.display();
}
}
class parent
{
void print()

{
System.out.println("INSIDE parents's print ");
}
}
class child extends parent
{
int a=10;
void print()
{
System.out.println("INSIDE child's print ");
}
void display()
{
System.out.println("INSIDE Child's Display ");
print();
super.print();
}
}