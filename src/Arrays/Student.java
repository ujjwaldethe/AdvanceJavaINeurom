package Arrays;

public class Student {
    String name;
    String coll;
    int age;
    int id;
    public Student()
    {

    }
    public Student(String name, int id, int age, String coll) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.coll = coll;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", coll='" + coll + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
