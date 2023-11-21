import java.io.*;

class MyClass implements Serializable {
    private int data;

    public MyClass(int data) {
        this.data = data;
    }

    public void display() {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(42);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serializedObject.ser"))) {
            out.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("serializedObject.ser"))) {
            MyClass restoredObj = (MyClass) in.readObject();
            System.out.println("Object deserialized successfully.");
            restoredObj.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
