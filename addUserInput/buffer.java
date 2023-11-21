import java.io.*;

class buffer {

    public static void main(String[] args) {

        System.out.println("Enter no : ");
        InputStreamReader ie = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ie);
        try {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println(a + b);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }

}
