import java.util.Scanner;
class Beverage
{
	public static void main(String args[])
	{
		int op;
		char c;
		Scanner sc =new Scanner(System.in);
		do
		{
			System.out.println("Enter your option:\n1.Tea\n2.Coffee\n3.Juice\n4.Exit");
			op=sc.nextInt();
			switch(op)
			{
				case 1:
					System.out.println("You ordered tea");
					break;
				case 2:
					System.out.println("You ordered coffee");
					break;
				case 3:
					System.out.println("You ordered juice");
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Sad, no beverage for you");
		
			}
			System.out.println("Do you want to continue? (y/n)");
			c = sc.next().charAt(0); //to input character
		} while(c=='y');
	}
}

