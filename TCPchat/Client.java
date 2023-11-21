import java.io.*;
import java.net.*;
public class Client {
public static void main(String[] args) {
BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

try {
String serverIP = "127.0.0.1";
int serverPort = 55555;
while (true) {
Socket socket = new Socket(serverIP, serverPort);
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
System.out.print("Enter message : ");
String messageToSend = userInputReader.readLine();
out.println(messageToSend);
String response = in.readLine();
System.out.println("Server response : " + response);
socket.close();
}
} catch (IOException e) {
e.printStackTrace();
}
}
}
