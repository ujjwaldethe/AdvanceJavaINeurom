package CollectionFramework.ArrayList;

import java.util.*;

public class AcccessingMethods {
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        al.add(10); //Autoboxing al.add (New Integer(10))
        al.add(2.0);//Autoboxing al.add(New Double(2.0))
        al.add('H');//Autoboxing al.add(New Character('c'));
        al.add(40);
        al.add(50);
        al.add(60);

        System.out.print(al+"\nUsing For Loop : ");
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.print("\nUsing For Each Loop : ");

        for(Object obj : al)
        {
            System.out.print(obj+" ");
        }
        System.out.println();

        System.out.print("\nUsing Iterator : ");
        Iterator itr = al.iterator();//Activate now and will be used in indexed based and not indexed bases ds.

        if(itr.hasNext());
        {
            System.out.print(itr.next());//will fetch the value.
        }
        System.out.print("\nAccesing All Elements : ");
        //Accessing Whole Elements
        while(itr.hasNext())
        {
            //Integer i = (Integer   ) itr.next();
            System.out.print(itr.next()+" ");
        }
        System.out.print("\nAccesing All Elements In Reverse Order : ");
        ListIterator litr = al.listIterator(al.size());
        while(litr.hasPrevious())
        {
            System.out.print(litr.previous()+" ");
        }
        ArrayDeque al2 = new ArrayDeque();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);
        al2.add(60);
        Iterator adit = al2.iterator();
        System.out.print("\nArray Dequeue Accesing All Elements Order : ");
        while(adit.hasNext())
        {
            Integer i = (Integer) adit.next();//casting to integer object.
            System.out.print(i+" ");

        }
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(30);
        ll.add(45);
        ListIterator lt = ll.listIterator(ll.size());
        System.out.print("\nLinkedList Accesing All Elements Reverse  Order : ");
        while (lt.hasPrevious())
        {
            System.out.print(lt.previous()+" ");
        }
    }
}
