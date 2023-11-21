class A {
    int i; // public by default
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    // Provide a protected method to access j
    protected int getJ() {
        return j;
    }
}

class B extends A {
    int total;

    void sum() {
        total = i + getJ(); // Access j through the protected method
    }
}

public class Access {
    public static void main(String args[]) {
        B subOb = new B();

        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
