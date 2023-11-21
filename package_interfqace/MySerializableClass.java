import java.io.*;

// Class implementing the Serializable interface
class MySerializableClass implements Serializable {
    // Some data members
    private int id;
    private String name;

    // Constructor
    public MySerializableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Create an object of the MySerializableClass class
        MySerializableClass obj = new MySerializableClass(1, "John Doe");

        // Serialize the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializedObject.ser"))) {
            oos.writeObject(obj);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializedObject.ser"))) {
            MySerializableClass deserializedObj = (MySerializableClass) ois.readObject();
            System.out.println("Object has been deserialized");
            System.out.println("ID: " + deserializedObj.getId());
            System.out.println("Name: " + deserializedObj.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
