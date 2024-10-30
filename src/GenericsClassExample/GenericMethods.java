package GenericsClassExample;

import java.util.ArrayList;

public class GenericMethods {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("sachine");
        //m1.add(new Integer(10)); Compile Time Error
        m1(al);
    }
    public static void m1(ArrayList al){
        al.add(10);
        al.add("Ujjwal");
        al.add(true);
        System.out.println(al);
    }


}
