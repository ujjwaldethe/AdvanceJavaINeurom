package GenericsClassExample;

import java.util.ArrayList;

class Student
{
        private int age;
        private int marks;
        private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, int marks, String name)
        {
            this.age=age;
            this.marks=marks;
            this.name = name;
        }
}
public class GenericsExample {
    public static void main(String args[]){
        Student s1 = new Student(12,75,"ujjwal");
        Student s2 = new Student(14,99,"pratik");
        Student s3 = new Student(12,79,"rohan");
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.print(al);
    }

}
