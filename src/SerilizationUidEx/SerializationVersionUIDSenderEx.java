package SerilizationUidEx;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DogSender implements Serializable{

    String name = "Tommy";
    int id = 1;
}
public class SerializationVersionUIDSenderEx {
    public static void main(String[] args) throws Exception{
        DogSender d = new DogSender();
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerilizationUidEx\\abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        System.out.println("Serialization Ended");

    }
}
