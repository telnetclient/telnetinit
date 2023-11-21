import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int n, r, num, rev=0;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		n=num;
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(rev==n)
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
	}
}
