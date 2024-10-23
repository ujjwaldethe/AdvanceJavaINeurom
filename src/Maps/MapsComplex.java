package Maps;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;

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
    @Override
    public String toString()
    {
        return name+" "+age+" "+city;
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

        Collection c = hm.values();
        Iterator itr = c.iterator();
        while(itr.hasNext())
        {
            System.out.print("\nValues : "+itr.next());
        }

        System.out.println("\n****************************************");


        Set sKey = hm.keySet();
        Iterator itr2 =sKey.iterator();

        while(itr2.hasNext())
        {
            System.out.print("\nKey Of Student : "+itr2.next());
        }

        System.out.println("\n****************************************");

        Set bothData = hm.entrySet();
        Iterator itr3 = bothData.iterator();
        while(itr3.hasNext()){
            Map.Entry data = (Map.Entry) itr3.next();
            System.out.println("Key : "+data.getKey()+" Value : "+data.getValue());
        }
    }
}
