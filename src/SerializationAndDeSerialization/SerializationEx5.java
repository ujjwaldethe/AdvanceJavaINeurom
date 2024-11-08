package SerializationAndDeSerialization;

import java.io.*;

class Animal {
    int i = 10;
    Animal()
    {
        this(30);
    }
    Animal(int i){
        this.i=i;
        System.out.println("Animal Constructor");
    }
}
class Dog5 extends Animal implements Serializable{
    Dog5(){
        System.out.println("Dog5 Constructor");
    }
    int j =20;
}
public class SerializationEx5 {
    public static void main(String[] args) throws Exception {
        Dog5 a = new Dog5();
        a.i=23;
        a.j=23;
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc5.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        System.out.println("Serialization Ended");

        System.out.println("De-serialization Started...");
        FileInputStream fis = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc5.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();

        Dog5 a1 = (Dog5) obj;

        System.out.println("I : "+a1.i+"\nj : "+a1.j);

        System.out.println("De-serialization Ended...");
    }
}
