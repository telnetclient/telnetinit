import java.util.Scanner;
class domainname
{
	public static void main(String arg[])
	{
		Scanner ab=new Scanner(System.in);
		String firstname,lastname,substr1="",substr2="",res;
                int i;
		System.out.print("Enter your first name: ");
		firstname=ab.nextLine();
		System.out.print("Enter your last name: ");
		lastname=ab.nextLine();
                for(i=0;i<3;i++)
                {
                substr1+=firstname.charAt(i);
                substr2+=lastname.charAt(i);
                }
                res="www."+substr1+substr2+".com";
		System.out.println("The domain name is "+res);
	}
}