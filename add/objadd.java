class objadd {
public static void main ( String args[]) {
Addition obj =new Addition ();
int res = obj.add(10,20);
System.out.println(res);
}
}

class Addition {
	public int add (int a , int b ) {
return a+ b;
}

}

