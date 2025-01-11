package CollectionFramework.TreeSet;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDS {
    public static void main(String args[])
    {
        TreeSet ts = new TreeSet();
        Set s= new HashSet();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s);
        s.add(10);
        System.out.println(s);
        ts.add(20);
        ts.add(50);
        ts.add(23);
        ts.add(87);
        ts.add(1);
        ts.add(4);
        ts.add(5);
        System.out.println(ts);
        System.out.println(ts.ceiling(50));//if object exit then return object othewise it will return higher value than object value
        System.out.println(ts.higher(50));//re
        System.out.println(ts.floor(50));//
        System.out.println(ts.lower(50));//if object exit then return object othewise it will return lower object lower than object value
        System.out.println("**********\n"+ts.ceiling(25));//if object exit then return object othewise it will return higher value than object value
        System.out.println(ts.higher(25));
        System.out.println(ts.floor(25));
        System.out.println(ts.lower(25));//if object exit then return object othewise it will return lower object lower than object value
        /*
        ceiling(E e):
        Returns the least element in the set greater than or equal to the given element e.
        If no such element exists, it returns null.
        Example: If the CollectionFramework.TreeSet contains {10, 20, 30} and you call ceiling(15), it returns 20.
        floor(E e):
        Returns the greatest element in the set less than or equal to the given element e.
        If no such element exists, it returns null.
        Example: If the CollectionFramework.TreeSet contains {10, 20, 30} and you call floor(25), it returns 20.
        higher(E e):
        Returns the least element in the set strictly greater than the given element e.
        If no such element exists, it returns null.
        Example: If the CollectionFramework.TreeSet contains {10, 20, 30} and you call higher(20), it returns 30.
        lower(E e):
        Returns the greatest element in the set strictly less than the given element e.
        If no such element exists, it returns null.
        Example: If the CollectionFramework.TreeSet contains {10, 20, 30} and you call lower(20), it returns 10.
        * */

    }
}
