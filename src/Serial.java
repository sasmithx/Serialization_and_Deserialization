import java.io.*;

public class Serial {
    public static void main(String[] args) {
        Student student = new Student("S001","Sasmith",22,"Galle","Sas@gmail.com" );

        // Serialize the object
        try (FileOutputStream fileOut = new FileOutputStream("student.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialize the object
        Student deserializedStudent = null;
        try (FileInputStream fileIn = new FileInputStream("student.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            deserializedStudent = (Student) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Deserialized Student: " + deserializedStudent);
    }
}