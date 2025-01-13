package Maps;
import java.util.*;
public class HashMapEx {
public static void main(String agrs[])
{
    HashMap hm = new HashMap();
    hm.put(1,"Ujjwal");
    hm.put(2,"krishn");
    hm.put(3,"Dethe");
    System.out.println("\n\n***********");
    System.out.print("\nHashMap : "+hm);


    Collection c = hm.values();
    Iterator itr = c.iterator();
    System.out.println("\n");

    while(itr.hasNext())
    {
        Object o =(String) itr.next();
        System.out.print(" "+o);
    }
    System.out.println("\n***********");
    Collection c1 = hm.keySet();
    Iterator itr1 = c1.iterator();
    while(itr1.hasNext())
    {
       // System.out.print(" "+itr1 .next());
        Integer i = (Integer) itr1.next();
        System.out.print("\n Key "+i);
    }

    LinkedHashMap hm1 = new LinkedHashMap();
    hm1.put(1,"Ujjwal");
    hm1.put(2,"krishn");
    hm1.put(3,"JDAD");
    System.out.println("\n***********");
    System.out.print("\nLinkedHashMap : "+hm1);

    Set s = hm.keySet();
    Iterator itr3 = s.iterator();
    System.out.print("\nSet(KeySet) : ");
    while (itr3.hasNext())
    {
        System.out.print(" "+itr3.next());
    }
    System.out.println("\n***********");
    System.out.print("\nSet(EntrySet) : ");
    Set s1 =hm.entrySet();
    Iterator itr4 = s1.iterator();
    while (itr4.hasNext())
    {
       Map.Entry stud =(Map.Entry) itr4.next();//Entry is inner interface of Map.
        System.out.print("\nKey : "+stud.getKey()+" Values : "+stud.getValue());
    }

}

}
