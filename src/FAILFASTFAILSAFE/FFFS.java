package FAILFASTFAILSAFE;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FFFS {
    public static void main(String args[]){
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(45);

        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
            //al.add(10); when while accessing object and adding to elemts then it is called as structural modification and program will continue forever.
        }
        Iterator itr = al.iterator();
        System.out.print("\nFail Fast (Exception Will Occur): ");
        try{
            while(itr.hasNext())
            {
                System.out.print(itr.next());
                al.add(10);
            }
        }
        catch (ConcurrentModificationException c)
        {
            System.out.print("\nError : "+c.getMessage());
        }

        /*
         In Java, collections such as ArrayList utilize a fail-fast mechanism to enhance reliability and prevent unpredictable behavior
         when iterating through elements. A fail-fast iterator detects concurrent modifications to the collection during iteration and
         immediately throws a ConcurrentModificationException.
         This feature allows developers to identify issues early in the development process.
         */

        //Fail Safe
        CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
        cal.add(100);
        cal.add(200);
        cal.add(300);
        cal.add(300);


        Iterator itrr=cal.iterator();
        System.out.print("\nFail Safe  (Exception Will Not Occur) : ");
        while(itrr.hasNext())
        {
            System.out.print(itrr.next()+" ");
        }

    }
}
