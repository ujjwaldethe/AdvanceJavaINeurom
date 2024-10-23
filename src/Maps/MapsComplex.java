package Maps;

import java.util.HashMap;
import java.util.Iterator;

class Student{
    private String name;
    private int age;
    private String city;

    Student(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
public class MapsComplex {
    public static void main(String args[])
    {
        Student s1 = new Student("ujjwal",19,"Mumbai");
        Student  s2 = new Student("Krishna",20,"Nashik");
        Student  s3 = new Student("Dada",20,"Nashik");

        HashMap hm = new HashMap();
        hm.put(1,s1);
        hm.put(2,s2);
        hm.put(3,s3);

    }
}
