import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		int num, i, sum=0, r, n;
		System.out.println("enter a number: ");
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		n=num;
		do
		{
			r=num%10;
			sum+=(r*r*r);
			num=num/10;
		} while(num>0);
		if(n==sum)
			System.out.println("it is an armstrong number");
		else
			System.out.println("it is not an armstrong number");
	}
}
