package FAILFASTFAILSAFE;

import java.util.ArrayList;

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
        /*
         In Java, collections such as ArrayList utilize a fail-fast mechanism to enhance reliability and prevent unpredictable behavior
         when iterating through elements. A fail-fast iterator detects concurrent modifications to the collection during iteration and
         immediately throws a ConcurrentModificationException.
         This feature allows developers to identify issues early in the development process.
         */

    }
}
