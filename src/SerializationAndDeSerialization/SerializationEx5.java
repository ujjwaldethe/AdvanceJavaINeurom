package SerializationAndDeSerialization;

import java.io.*;

class Animal implements Serializable{
    int i = 10;
}
class Dog5 extends  Animal{
    int j =20;
}
public class SerializationEx5 {
    public static void main(String[] args) throws Exception {
        Dog a = new Dog();
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc5.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        System.out.println("Serialization Ended");

        System.out.println("De-serialization Started...");
        FileInputStream fis = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc5.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();

        Dog a1 = (Dog) obj;

        System.out.println("I : "+a1.i+"\nj : "+a1.j);

        System.out.println("De-serialization Ended...");
    }
}
