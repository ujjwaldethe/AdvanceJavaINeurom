package CollectionFramework.HashSetDS;
import java.util.*;
public class HashSet2 {
    public  static void main(String args[])
    {
        LinkedHashSet ls = new LinkedHashSet();
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(40);
        hs.add(23);
        hs.add(343);
        System.out.println("Hashset : "+hs);
        ls.add(100);
        ls.add(40);
        ls.add(23);
        ls.add(343);
        System.out.println("LinkedHashset : "+ls);

    }
}
