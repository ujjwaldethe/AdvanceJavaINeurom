package CollectionFramework.LinkedListExample;
import java.util.*;
public class LinkedListExample {
    public static void main(String args[])
    {
        LinkedList ll2 = new LinkedList();
        ll2.add(10);
        ll2.add(2);
        ll2.add(20);
        ll2.add(30);
        System.out.println(ll2);
        System.out.println(ll2.getFirst());
        System.out.println(ll2.getLast());

        System.out.println(ll2.indexOf(30));
        System.out.println(ll2.lastIndexOf(300));
        System.out.println("***************************");
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add("Ineuron");
        ll1.add(20);
        System.out.println(ll1);
        ll1.addFirst("Ujjwal Dethe");
        System.out.println(ll1);
        ll1.add(2,"Nashik");
        System.out.println(ll1);
        ll1.addLast("Krishna");
        System.out.println(ll1);
        System.out.print("Accesing Each Object One By One : ");
        for(int i=0;i<ll1.size();i++)
        {
            System.out.print(" "+ll1.get(i));
        }
        System.out.println();
        System.out.print("Accesing Each Object One By One : ");
        for(Object obj : ll1)
        {
            System.out.print(" "+obj);
        }

        //Methods Of LinkedList
        System.out.println("\n"+ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.lastIndexOf(20));
        System.out.println(ll1.indexOf(20));
        ll1.offerFirst(23);//might add or not
        ll1.offerLast(34);//might add or not
        System.out.println(ll1);
        ll1.addFirst(5);//compulsorily add
        ll1.addLast(10);//compulsorily add
        System.out.println(ll1);
        System.out.println(ll1.peekFirst());//does not affect linkedlist,it will fetch only.If the list is empty, it returns null instead of throwing an exception
        System.out.println(ll1);
        System.out.println(ll1.pollFirst());//it will fetch and delete from the linked list.
        System.out.println(ll1);

        System.out.println(ll1.getFirst());//If the list is empty, it throws a NoSuchElementException.
        ll1.clear();
        System.out.println(ll1.peekFirst());





    }
}
