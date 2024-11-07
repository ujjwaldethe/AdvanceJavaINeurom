package SerializationAndDeSerialization;

import java.io.*;

class Dog1 implements Serializable {
    transient int i = 10 ;
    transient int j = 20;
    static transient int k= 10;
    final transient int l = 20;
}
public class SerializationEx2 {
    public static void main(String[] args) throws Exception{
        Dog1 d = new Dog1();
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc2.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);

        System.out.println("Serialized Object Reference : "+d);
        System.out.println("Serialization Ended");

        System.out.println("De-serialization Started...");
        FileInputStream fis = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc2.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        /*
        Object Creation Is Happening Internally Using Method Body : readObject()
        Getting Old Object So Constructor Is Not Called.
        State Of The Object Is Same i.e : Instance Variables*/
        Dog1 d1= (Dog1) obj;
        /*
         * Error We Should Read Object In A Way That It Is Added
         * Cat c1 =(Cat)obj2;
         * Dog d1= (Dog) obj;
         * */
        System.out.println(d1.i+" "+d1.j+" "+d1.k+" "+d1.l);
        System.out.println("De-Serialized Object Reference : "+d1);
        System.out.println("De-serialization Ended...");
    }
}
