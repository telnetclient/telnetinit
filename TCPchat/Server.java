import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
public static void main(String[] args) {
String IP = "127.0.0.1";
int SERVER_PORT = 55555;
try {
Scanner s = new Scanner(System.in);
ServerSocket serverSocket = new ServerSocket(SERVER_PORT, 50, InetAddress.getByName(IP));
System.out.println("Server listening on " + IP + ":" + SERVER_PORT);
while (true) {
Socket clientSocket = serverSocket.accept();
System.out.println("Client connected : " + clientSocket.getInetAddress());
BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
String message = in.readLine();
System.out.println("Received from client : " + message);
System.out.print("Enter the message : ");
String messageToSend = s.nextLine();
out.println(messageToSend);
clientSocket.close();
}
} catch (IOException e) {
e.printStackTrace();
}
}
}
