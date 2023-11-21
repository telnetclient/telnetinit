public class Normal {
  private int x;

  // Normal constructor
 Normal(int x) {
      this.x = x;
  }

  public static void main(String[] args) {
      // Create an instance of MyClass using the normal constructor
      Normal obj = new Normal(5);
      System.out.println("Value of x: " + obj.x);
  }
}

