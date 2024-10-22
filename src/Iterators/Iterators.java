package Iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(30);
        ll.add(40);
        ll.add(45);
        ll.add(564);
        //iterator is a class which is used access objects of colletion classes one by one
        //Types are :
        //Simple iterator : Iterator
        Iterator llitr =  ll.listIterator();
        System.out.print("\nUsing Iterator : ");
        while(llitr.hasNext())
        {
            System.out.print(llitr.next()+" ");
        }
        System.out.print("\nUsing ListIterator (need to specify size in parameters) : ");
        //ListIterator : this iterator is only present in ArrayList And LinkedList Because index based accessing is only allowed in both two classes.
        ListIterator lli = ll.listIterator(ll.size());
        //you need to specify size of linked list or arraylist  objects in his parameters.\
        while (lli.hasPrevious())
        {
            System.out.print(lli.previous()+" ");
        }
        System.out.print("\nUsing Descending Iterator(no need to specify size in parameters) : ");
        //descendingIterator : for this iterator you dont need to pass size of list, it automatically points to the last object of the list.
        Iterator ditr = ll.descendingIterator();
        while (ditr.hasNext())
        {
            System.out.print(ditr.next()+" ");
        }

    }
}
