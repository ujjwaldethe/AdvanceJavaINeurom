package SortingCollections;

import java.util.*;

import static java.util.Collections.*;

public class CollectionsExample {
    public static void main(String args[])
    {
        //100 50 150 25 75 125 275
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(275);

        System.out.print("\n\nCollectionFramework.TreeSet(Automatically Sorts) : "+ts);

        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(275);

        System.out.print("\n\n3 : "+al);

        Collections.sort(al);

        System.out.print("\n\n Arraylist Sorted Using Collection Class : "+al);

        ArrayList<String> s = new ArrayList<String>();
        s.add("Ujwal");
        s.add("Dethe");
        s.add("A");
        s.add("B");

        Collections.sort(s);
        System.out.print("\n\n Array List(String) Sorted : "+s);
        //Error s.add(10);

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(200);
        al2.add(400);
        al2.add(100);
        //Error al2.add("Ujjwal");
        Collections.sort(al2);
        System.out.print("\n"+al2);

        ArrayList al4= new ArrayList();
        al4.add(25);
        al4.add(50);
        al4.add(75);
        al4.add(100);
        al4.add(125);
        al4.add(150);
        al4.add(275);

        //few more important inbuilt methods of collections class

        System.out.print("\n\nIndex : "+Collections.binarySearch(al4,25));
        Collections.shuffle(al4);
        System.out.print("\n\n Shuffled : "+al4);
        System.out.print("\n\n count frequency : "+Collections.frequency(al4,50));

    }
}
