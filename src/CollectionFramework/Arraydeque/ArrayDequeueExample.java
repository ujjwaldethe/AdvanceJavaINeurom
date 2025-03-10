package CollectionFramework.Arraydeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeueExample {

    public static void main(String args[]) {

        ArrayDeque ad = new ArrayDeque();
        ad.add(55);
        ad.add(53);
        ad.add(55);
        ad.add(52);
        ad.addLast(30);
        ad.addLast(565);
        //ad.add(1,3); indexed based insertion is not allowed.-K
        System.out.println(ad);
        for(Object obj : ad)
        {
            System.out.println(ad);
        }
        Scanner sc = new Scanner(System.in);
        Integer search = sc.nextInt();
        for(Object obj : ad)
        {
            if(obj.equals(search))
            {
                System.out.println(obj);
                break;
            }
        }

    }
}
