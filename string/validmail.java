import java.util.Scanner;

class validmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        scanner.close();

        int result = 0;
        int atIndex = 0;
	    int l = email.length();
	    while (email.charAt(atIndex) != '@' && (++atIndex) < l);
        int dotIndex = l-1;
	    while (email.charAt(dotIndex) != '.' && (--dotIndex) != -1);
        if (atIndex <= 0 || atIndex == l || dotIndex <= atIndex || dotIndex == -1 || dotIndex==atIndex+1) 
            result=-2;
	    else
	    result=-1;
        if (result == -1) 
            System.out.println(email + " is valid");
        else if (result == 0)
            System.out.println("You Entered nothing");
        else {
            System.out.println("The mail you have entered is Invalid");
        }
    }
}