package SerializationAndDeSerialization;

import java.io.*;

class Account implements Serializable {
        String username = "ujjwal";
        transient String password = "123456";
}


public class SerializationEx4 {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc3.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);

        System.out.println("Serialization Ended");

        System.out.println("De-serialization Started...");
        FileInputStream fis = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\SerializationAndDeSerialization\\abc3.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();

        Account acc = (Account) obj;

        System.out.println("Username : "+acc.username+"\nPassword : "+acc.password);

        System.out.println("De-serialization Ended...");
    }
}
