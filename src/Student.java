import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private int age;
    private String city;
    private String gmail;

    public Student(String id, String name, int age, String city, String gmail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}