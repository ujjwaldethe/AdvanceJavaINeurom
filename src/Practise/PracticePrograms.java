package Practise;

import java.rmi.StubNotFoundException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Student{
    private int age;
    private int marks;
    private String name;
    public Student(int age,int marks,String name)
    {
        this.age=age;
        this.marks=marks;
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public int getMarks()
    {
        return marks;
    }
    public String name()
    {
        return name;
    }
    public String toString()
    {
        return "Age : "+age+" Marks : "+marks+" Name : "+name;
    }
}
public class PracticePrograms {
    public static void main(String args[])
    {
        Student s1 = new Student(21,94,"Ujjwal");
        Student s2 = new Student(22,99,"Krishna");
        Student s3 = new Student(23,88,"Swaraj");
        ArrayList<Student> sal = new ArrayList<Student>();
        sal.add(s1);
        sal.add(s2);
        sal.add(s3);

        System.out.print("\nObject Accessing : "+sal);

        ArrayList al = new ArrayList();
        al.add(1030);
        al.add(200);
        al.add(3040);
        al.add(40330);
        al.add(5030);

        System.out.println("\n\nIndex : "+Collections.binarySearch(al,34));
        Collections.shuffle(al);
        System.out.println(al);
        System.out.println(Collections.frequency(al,54));
        System.out.print("\nAccessing Using Loops : ");
        for(int i=0;i<al.size();i++)
        {
            System.out.print(" "+al.get(i));
            //al.add(300);
        }
        System.out.print("\nFail Fast : ");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.print(" "+itr.next());
        }
        CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
        cal.add(1040);
        cal.add(200);
        cal.add(3040);
        cal.add(400);
        cal.add(5040);
        System.out.print("\nFail Safe : ");
        Iterator clitr = cal.iterator();
        while(clitr.hasNext())
        {
            System.out.print(clitr.next()+" ");
            cal.add(2000);
            cal.add(2323);
        }

        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(200);
        ts.add(300);
        ts.add(45);
        ts.add(343);
        ts.add(6565);
        ts.add(3432);
        System.out.println("\nTree Set : "+ts);
        Collections.sort(al);
        System.out.println("Sorted Array List : "+al);

        ArrayList al2 = new ArrayList();
        al2.add("Ujjwal");
        al2.add("Dethe");
        al2.add(21);
        al2.add(8.21);
        System.out.println( al2);
    }
}