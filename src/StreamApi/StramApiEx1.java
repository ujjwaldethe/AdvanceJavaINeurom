package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StramApiEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        System.out.println(al);

        ArrayList<Integer> evenAl = new ArrayList<Integer>();
        for (Integer i1 : al) {
            if (i1 % 2 == 0) {
                evenAl.add(i1);
            }
        }
        System.out.println(evenAl);
        /*From JDK 1.8V We Use Streams
         * 1.Configuration ==> al.stream
         * 2.Processing    ==> filter(i->i&2==0).collect.(Collectors.toList());*/

        //List<Integer> streamlist = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
       // streamlist.forEach(System.out::println);


        ArrayList<Integer> doubleList = new ArrayList<Integer>();

        for (Integer i2 : al) {
            doubleList.add(i2 * 2);
        }
        List<Integer> streamlist1 = al.stream().map(obj->obj*2).collect(Collectors.toList());
        al.forEach(System.out::println);
        System.out.println(al);
        System.out.println(streamlist1);

        List<Integer> resultList1 = al.stream().sorted().collect(Collectors.toList());
        System.out.println("Sort : "+resultList1);

        List<Integer> resultList = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("Reverse Sort : "+resultList);

        Integer resultList2 = al.stream().min((i1,i2)->i1.compareTo(i2)).get ();
        System.out.println("Minimum : "+resultList2);

        Integer resultList3 = al.stream().max((i1,i2)->i1.compareTo(i2)).get ();
        System.out.println("Maximum  : "+resultList3);

        Object obj[]=al.stream().toArray();
        for(Object objArr : obj)
            System.out.println(objArr);

        Object objArr1[]=al.stream().toArray(Integer[]:: new);
        for(Object obj2 : objArr1)
            System.out.println(obj2);
    }
}
