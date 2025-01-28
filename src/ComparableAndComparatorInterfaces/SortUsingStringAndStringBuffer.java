package ComparableAndComparatorInterfaces;
import java.util.Comparator;
import java.util.TreeSet;
class  MyComparator1 implements Comparator  {
    @Override
    public int compare(Object obj1,Object obj2){

        String i11 =obj1.toString();
        String i12 =obj2.toString();
        return i12.compareTo(i11);
    }
}
public class SortUsingStringAndStringBuffer {
    public static void main(String[] args) {
        TreeSet s = new TreeSet(new MyComparator1());
        s.add("A");
        s.add("ABC");
        s.add("AA");
        s.add("fefe");
        s.add("AAaAa");
        s.add("XX");
        s.add("A");
        s.add(new StringBuffer("ABCE"));
        System.out.println(s);


    }
}
