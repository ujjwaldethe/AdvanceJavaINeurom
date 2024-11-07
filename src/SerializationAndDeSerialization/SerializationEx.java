package SerializationAndDeSerialization;

import java.io.*;

class Dog implements Serializable {
    static {
        System.out.println("Static Block Gets Executed");
    }
    {
        System.out.println("Initializer Block");
    }
    Dog()
    {
        System.out.println("Object Is Called");
    }
      int i = 10 ;
     int j = 20;
}
class Cat implements Serializable {
    static {
        System.out.println("Static Block Gets Executed");
    }
    {
        System.out.println("Initializer Block");
    }
    Cat()
    {
        System.out.println("Object Is Called");
    }
    int i = 100 ;
    int j = 200;
}
public class SerializationEx {
    public static void main(String[] args) throws Exception{
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        oos.writeObject(c);
        System.out.println("Serialized Object Reference : "+d);
        System.out.println("Serialization Ended");

        System.out.println("De-serialization Started...");
        FileInputStream fis = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        Object obj2 = ois.readObject();



        /*
        Object Creation Is Happening Internally Using Method Body : readObject()
        Getting Old Object So Constructor Is Not Called.
        State Of The Object Is Same i.e : Instance Variables*/
        Dog d1= (Dog) obj;
        Cat c1 =(Cat)obj2;
        /*
        * Error We Should Read Object In A Way That It Is Added
        * Cat c1 =(Cat)obj2;
        * Dog d1= (Dog) obj;
        * */


        System.out.println(d1.i+" "+d1.j);
        System.out.println(c1.i+" "+c1.j);
        System.out.println("De-Serialized Object Reference : "+d1);
        System.out.println("De-serialization Ended...");
    }
}
