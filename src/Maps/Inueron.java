package Maps;

import java.util.Hashtable;

class krish{
    int i;
    public krish(int i){
        this.i=i;
    }
}
public class Inueron {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(11,"Ujjwal");
        ht.put(22,"Krish");
        System.out.println(ht);
        System.out.println();
        Hashtable ht1 = new Hashtable();
        ht1.put(new krish(11),"ujjwal");
        ht1.put(new krish(22),"krish");
        ht1.put(new krish(33),"krishna");
        System.out.println(ht1);
    }
}
