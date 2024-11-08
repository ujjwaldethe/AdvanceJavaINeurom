package SerilizationUidEx;



import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;



public class SerializationVersionUIDReceiverEx {
    public static void main(String[] args) throws Exception{
        System.out.println("De-serialization Started...");
        FileInputStream fis = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerilizationUidEx\\abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogSender d = (DogSender) ois.readObject();
        System.out.println("Name : "+d.name+"\n"+"Id : "+d.id);
        System.out.println("De-serialization Ended...");
    }
}
