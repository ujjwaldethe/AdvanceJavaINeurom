package Maps;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(1,"A");
        tm.put(3,"C");
        tm.put(2,"B");
        //Sorts Acccording TO Keys
        System.out.println(tm);
    }
}
