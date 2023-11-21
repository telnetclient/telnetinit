import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {

    public static void main(String[] args) {
        // File writing example
        writeToFile("example.txt", "Hello, this is a simple file writing example!");

        // File reading example
        String content = readFromFile("example.txt");
        System.out.println("Content read from file:\n" + content);
    }

    // Method to write content to a file
    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content written to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
