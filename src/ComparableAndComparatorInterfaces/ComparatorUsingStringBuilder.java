package ComparableAndComparatorInterfaces;

import java.util.Comparator;
import java.util.TreeSet;
class  MyComparator11 implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){

        StringBuffer i11 = (StringBuffer) obj1;
        StringBuffer i12 =(StringBuffer) obj2;
        return i11.compareTo(i12);
    }
}
public class ComparatorUsingStringBuilder {
    public static void main(String[] args) {
        TreeSet s1 = new TreeSet(new MyComparator11());
        s1.add(new StringBuffer("ujjwal"));
        s1.add(new StringBuffer("Shriram"));
        s1.add(new StringBuffer("Dethe"));

        System.out.println(s1);
    }
}


