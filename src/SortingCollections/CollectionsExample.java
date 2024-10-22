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

        System.out.print("\n\nTreeSet(Automatically Sorts) : "+ts);

        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(275);

        System.out.print("\n\nArrayList : "+al);

        Collections.sort(al);

        System.out.print("\n\n Arraylist Sorted Using Collection Class : "+al);

    }
}
