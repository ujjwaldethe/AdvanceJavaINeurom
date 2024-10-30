package ComparableAndComparatorInterfaces;

import java.util.Comparator;
import java.util.TreeSet;

class  MyComparator implements Comparator{
    @Override
    public int compare(Object obj1,Object obj2){

        String i1 = (String) obj1;
        String i2 =(String) obj2;
        return i1.compareTo(i2);
        /*
        * i1.compareTo(i2); Ascending Order
        * -i1.compareTo(i2); Descending Order
        * i2.compareTo(i1);Descending Order
        * -i2.compareTo(i1);Ascending Order
        * return +1 Insertion Order
        * return -1 Reverse Insertion Order
        * return 0 Only First Element*/

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
        s.add("Abc");
        s.add("Bncd");
        s.add("Cfe");
        s.add("Dfefe");
        s.add("Efefe");

        System.out.println(s);
    }
}
