class InstanceOfEg2 extends Parent
{
public static void main(String args[])
{
InstanceOfEg2 i=new InstanceOfEg2();
System.out.println(i instanceof InstanceOfEg2 );
InstanceOfEg2 j=null ;
System.out.println(j instanceof InstanceOfEg2 );
//Cannot downcast this way, It will give error
/* InstanceOfEg2 k=new Parent();
System.out.println(k instanceof InstanceOfEg2 );
*/
//Compiles successfully but ClassCastException is thrown at runtime
/*
InstanceOfEg2 k=(InstanceOfEg2) new Parent();
System.out.println(k instanceof InstanceOfEg2 );
*/
Parent p1=new InstanceOfEg2 ();
System.out.println(p1 instanceof InstanceOfEg2 );
}
}
class Parent
{
}