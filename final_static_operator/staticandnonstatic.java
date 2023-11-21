import java.util.Scanner;
class staticandnonstatic
{
	static int count=0;
	int cnt1=0;   
	staticandnonstatic()
	{
		count++; 
		cnt1++; 
		System.out.println("Static value of count: "+count+'\t'+ "Non static value of count: "+cnt1);  
	}  
	public static void main(String args[])
	{
		staticandnonstatic c1=new staticandnonstatic();  
		staticandnonstatic c2=new staticandnonstatic();  
		staticandnonstatic c3=new staticandnonstatic();  
	}
}