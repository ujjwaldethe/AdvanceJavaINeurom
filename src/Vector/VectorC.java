package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorC {
    public static void main(String args[])
    {
        //We Are going to learn enumerators concept
        Vector v = new Vector();
        v.add(100);
        v.add(200);
        v.add(300);
        v.add(400);
        v.add(500);
        Enumeration em = v.elements();
        //Enumeration is not used in collection classes
        //Its is used for legacy classes(vector,stack,hashtable).
//        Iterator:
//        Found in the java.util package.
//        It is more general-purpose and works with any collection class (e.g., List, Set, etc.).
//        Provides methods like hasNext(), next(), and remove().
//            remove() allows you to remove elements from the collection during iteration.
//        It is a more flexible interface and is widely used in modern Java.
//        Enumerator:
//        Found in the java.util package as well but is part of the legacy collection framework.
//        It is less commonly used today since newer collections like Iterator provide more functionality.
//        Provides only hasMoreElements() and nextElement() methods.
//            It does not have the remove() method.
//            Enumerator is used for legacy classes like Vector and Stack.
        System.out.print("\n Accesing Objects Using Enumerators: ");
        while (em.hasMoreElements())
        {
            System.out.print(em.nextElement()+" ");
        }
    }
}
