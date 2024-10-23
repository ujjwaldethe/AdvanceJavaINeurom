package Maps;
import java.util.*;
public class HashMapEx {
public static void main(String agrs[])
{
    HashMap hm = new HashMap();
    hm.put(1,"Ujjwal");
    hm.put(2,"krishn");
    hm.put(3,"JDAD");
    System.out.print("\nHashMap : "+hm);

    LinkedHashMap hm1 = new LinkedHashMap();
    hm1.put(1,"Ujjwal");
    hm1.put(2,"krishn");
    hm1.put(3,"JDAD");
    System.out.print("\nLinkedHashMap : "+hm1);
}

}
