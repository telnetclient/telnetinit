import java.util.Scanner;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        scanner.close();

        int result = -1;
        int atIndex = 0;
	    int l = email.length();
	    while (email.charAt(atIndex) != '@' && (++atIndex) < l);
        int dotIndex = l-1;
	    while (email.charAt(dotIndex) != '.' && (--dotIndex) != -1);
        if (atIndex <= 0) 
            result=-2;
        if (atIndex == l)
	    result=-5;
	    if (dotIndex <= atIndex) {
            if (dotIndex == -1) 
                result=-4;
            result=-3;
	}
        if (result == -1) 
            System.out.println(email + " is valid");
        else if (result == 0)
            System.out.println("You Entered nothing");
        else {
            System.out.println("The mail you have entered is Invalid");
            if (result == -2)
                System.out.println("Encountered @ without entering any name.");
            else if (result == -3)
                System.out.println("Dot missing after @.");
            else if (result == -4)
                System.out.println("Given no dots in your mail.");
            else if (result == -5)
                System.out.println("Missing @ in your address.");
            else
                System.out.println("Encountered invalid symbol " + email.charAt(result));
        }
    }
}