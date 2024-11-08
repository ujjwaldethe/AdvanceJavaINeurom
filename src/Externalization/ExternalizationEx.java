package Externalization;

import java.io.*;

class Demo implements Externalizable {
    String name;
    int i;
    transient int j;
    public Demo(){
        System.out.println("Zero Arguments");
    }
    Demo(String name , int i , int j){
        this.name =name;
        this.i = i ;
        this.j = j;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("wrote");
        out.writeObject(name);
        out.writeObject(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        i=(Integer) in.readObject();
    }
}
public class ExternalizationEx {
    public static void main(String[] args) throws Exception {
        Demo a =new Demo("ujjwal",1,3);
        System.out.println("Externalization Started");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\Externalization\\abc6.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        System.out.println("Externalization Ended");

        System.out.println("De-Externalization Started...");
        FileInputStream fis = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\Externalization\\abc6.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo d2 = (Demo) ois.readObject();

        System.out.println(d2.name+" "+d2.i+" "+d2.j+" "+a.j);
        System.out.println("De-Externalization Ended...");
    }
}
