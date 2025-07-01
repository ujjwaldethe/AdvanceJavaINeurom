package Abstraction;

class Person
{
    String name;
    Integer age;
    Float height;
    Person()
    {
        super();
    }
    Person(String name,Integer age,Float height)
    {
        this.age = age;
        this.height = height;
        this.name =name;
    }
}
class Student extends Person
{

    Integer sid;
    Float marks;
    String courseName;
    public Student(String name, Integer age, Float height, Integer sid, Float marks, String courseName) {
        super(name, age, height);
        this.sid = sid;
        this.marks = marks;
        this.courseName = courseName;
    }

}


public class Test {
    public static void main(String[] args) {

    }
}
