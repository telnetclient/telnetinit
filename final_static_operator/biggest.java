import java.util.Scanner;
class biggest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 2 numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();
int big=(a>b)?a:b;
System.out.println("Biggest: "+big);
}
}