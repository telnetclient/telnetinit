import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		int i=2, num, n1=0, n2=1, n3;
		System.out.println("Fibonacci series");
		System.out.println("Enter the number: ");
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		while(i<num)
		{
			n3=n2+n1;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			i++;
		}
	}
}

