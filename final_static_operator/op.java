import java.util.Scanner;

class op{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number1:");
		System.out.println("Enter Number2:");
		int a= s.nextInt();
		int b= s.nextInt();
		final int x=a;
		final int y=b;
		System.out.println("\nUNARY OPERATORS");
		int c=a++;
		int d=++a;
		System.out.println("post increment of "+a+" is " +c);
		System.out.println("pre increment of "+a+" is " +d +"\n");

		System.out.println("ARITHMETIC OPERATORS");
		c=x+y;
		d=x-y;
		int e=x*y;
		float f=x/y;
		int g=x%y;
		System.out.println("+:" +c);
		System.out.println("-:" +d);
		System.out.println("*:" +e);
		System.out.println("/:" +f);
		System.out.println("%:" +g+"\n");
		
		System.out.println("SHIFT OPERATOR");
		c=a>>2;
		d=a<<2;
		System.out.println("signed right shift 2 bits:" +c);
		System.out.println("signed left shift 2 bits:" +d+"\n");
		
		System.out.println("RELATIONAL OPERATOR");
		if(x>y) {System.out.println(x+" is greater than "+y);}
		else {System.out.println(x+" is not greater than "+y);}
		if (x<=y) {System.out.println(x+" is lesser than or equal to "+y);}
		else {System.out.println(x+" is not lesser or than or equal to "+y);}
		if(x==y) System.out.println(x+" is equal to "+y);
		else  System.out.println(x+" is not equal to "+y);
		if(x!=y) System.out.println(x+" is not equal to "+y);
		else  System.out.println(x+" is equal to "+y);
		System.out.println();

		System.out.println("BITWISE OPERATOR");
		System.out.println("bitwise AND:"+(x&y));
		System.out.println("bitwise inclusive OR:"+(x|y));
		System.out.println("bitwise exclusive OR:"+(x^y));	
		System.out.println();

		System.out.println("LOGICAL OPERATOR");
		if((x>0) && (y>5)) {System.out.println(x+" is greater than 0 and "+y+" is greater than 5");}
		else {System.out.println("x>0 and y>5 condition is failed");}
		if((x>0) || (y>5)) {System.out.println(x+" is greater than 0 OR "+y+" is greater than 5");}
		else {System.out.println("x>0 OR y>5 condition is failed");}
		System.out.println();

		System.out.println("ASSIGNMENT OPERATOR");
		System.out.println("value of a:"+a);
		a+=2;
		System.out.println("a+=2, a=a+2 "+a);
	}
}