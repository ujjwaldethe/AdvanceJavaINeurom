package ComparableAndComparatorInterfaces;

import java.util.Comparator;
import java.util.TreeSet;

class  MyComparator implements Comparator{
    @Override
    public int compare(Object obj1,Object obj2){

        String i1 = (String) obj1;
        String i2 =(String) obj2;
        return i2.compareTo(i1);
//        Integer i1 = (Integer) obj1;
//        Integer i2 = (Integer) obj2;
//        if(i1<i2){
//            return +1;
//        }
//        else if(i1>i2){
//            return -1;
//        }
//        else{
//            return 0;
//        }
    }
}
public class ComparatorInterface {
    public static void main(String[] args) {
        TreeSet s = new TreeSet(new MyComparator());
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("E");

        System.out.println(s);
    }
}
