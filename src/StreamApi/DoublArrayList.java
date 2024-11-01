package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoublArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        System.out.println(al);

        ArrayList<Integer> doubleList = new ArrayList<Integer>();

        for (Integer i2 : al) {
            doubleList.add(i2 * 2);
        }
        System.out.println(doubleList);

        List<Integer> ls =al.stream().map(obj->obj*2).collect(Collectors.toList());
        ls.forEach(i-> System.out.println(i));

        ls.forEach(System.out::println);

        System.out.println(al);
        System.out.println(ls);
    }
}
