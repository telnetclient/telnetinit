// Base or Super Class
class Server {
   void my_frontend() {
       System.out.println("Connection to frontend established successfully");
   }
}

// Sub Classes
class Java extends Server {
   void my_backend() {
       System.out.println("Connection to backend established successfully");
   }
}

class Connection extends Java {
   void my_database() {
       System.out.println("Connection to database established successfully");
   }
}

// Driver Class
public class HI2 {
   public static void main(String args[]) {
       Connection my_connection = new Connection();
       my_connection.my_database();
       my_connection.my_backend();
       my_connection.my_frontend();
   }
}
