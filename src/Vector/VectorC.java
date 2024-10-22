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
        System.out.print("\n Accesing Objects Using Enumerators: ");
        while (em.hasMoreElements())
        {
            System.out.print(em.nextElement()+" ");
        }
    }
}
