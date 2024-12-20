package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);

        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add("ineuron");
        al2.add("free");
        al2.add("pirated");
        al2.add(10);
        al2.add('b');
        al2.add(10.2);
        System.out.println(al2);
        //we can add entire collection into another or new collection
        ArrayList al3 = new ArrayList();
        al3.addAll(al2);
        System.out.println(al3);

        ArrayList al4 = new ArrayList();
        al4.add(11);
        al4.add(22);
        al4.add(33);
        al4.add(44);
        al4.addFirst(20);
        System.out.println("Existing Data : " + al4);
        al4.add(2, 28);
        System.out.println("After Adding in 2nd Index : " + al4);

        al4.add(0, 5);
        System.out.println("After Adding in 0th Index : " + al4);


        al4.add(348);
        System.out.println("After Adding in Rear End : " + al4);

        al4.addAll(1, al1);
        al4.addAll(2, al3);

        System.out.println(al4);

        for (int i = 0; i < al4.size(); i++)
        {
            System.out.print(" "+al4.get(i));
        }

        for(Object fruit : al4)
        {
            System.out.println(al4);
        }

        //ArrayList Methods
        System.out.println(al4.contains(22));
        System.out.println(al4.indexOf(5));
        System.out.println(al4.isEmpty());
        System.out.println(al4.size());
        al4.ensureCapacity(40);
        System.out.println(al4.size());
        al4.trimToSize();//it will (shrink) to existing element size
        al4.clear();
        System.out.println(al4);
        System.out.println(al4.size());

    }
}
