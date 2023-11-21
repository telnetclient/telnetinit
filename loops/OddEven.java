import java.util.*;
class OddEven
{
	public static void main(String args[])
	{
		int n;
		System.out.println("enter a number");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("It is an even number");
		}
		else
		{
			System.out.println("It is an odd number");
		}
	}
}
