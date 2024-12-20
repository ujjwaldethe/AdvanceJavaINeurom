package SerializationAndDeSerialization;

import java.io.*;

class Account implements Serializable {//Custom Serialization
        String username = "ujjwal";
        transient String password = "123456";
        transient int pin=444;

        //Write Logic For Serialization
        private void writeObject(ObjectOutputStream oos) throws IOException{
            oos.defaultWriteObject();
            String ecps= "123"+password;
            int privatePin = 111+pin;
            oos.writeObject(ecps);
            oos.writeObject(privatePin);
        }
        //Write Logic For De-Serialization
        private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
            ois.defaultReadObject();
            String strpas = (String)ois.readObject();
            int priPin = (Integer)ois.readObject();
            password = strpas.substring(3);
            pin=priPin-111;


        }

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

        System.out.println("Username : "+acc.username+"\nPassword : "+acc.password+"\nPin : "+ acc.pin);

        System.out.println("De-serialization Ended...");
    }
}
