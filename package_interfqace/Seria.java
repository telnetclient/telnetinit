
import java.io.*;

// Class implementing the Serializable interface
public class Student implements Serializable {
    public String name;
    public String dept;
    public int id;

    public Student(String name, String dept, int id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
    }
}

public class Seria {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create a Student object
        Student student = new Student("John Doe", "Computer Science", 123);

        // Serialize the Student object
        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
        fos.close();

        // Deserialize the Student object
        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student deserializedStudent = (Student) ois.readObject();
        ois.close();
        fis.close();

        // Print the deserialized Student object
        System.out.println("Deserialized Student: " + deserializedStudent.name + ", " + deserializedStudent.dept + ", " + deserializedStudent.id);
    }
}

