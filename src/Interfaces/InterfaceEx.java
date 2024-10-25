package Interfaces;
interface krish{
    public static final int a =10;
    int b = 20;
    void teaches();
    void writescode();
    //interface can have method with body
    default void display(){
        System.out.println("compulsory to write default keyword");
        System.out.print("Interface Can Have Method With Body");
        disp3();
        disp4();
    }
    static void disp2()
    {
        System.out.println("\nStatic Method");
    }
    private void disp3()
    {

        System.out.println("\nPrivateInterface Can Private Method After Java 9");
    }
    private static void disp4()
    {
        System.out.println("\nPrivate Static Interface Can Private Method After Java 9");
    }
}

class Student implements krish{
    @Override
    public void teaches() {
        System.out.println("learning java");
    }
    @Override
    public void writescode()
    {
        System.out.println("Writing Codes");
    }
//    @Override
//    public void display()
//    {
//        System.out.print("Overrided");
//    }

}
public class InterfaceEx {
    public static void main(String[] args) {
     Student s = new Student();
     s.teaches();
     s.writescode();
     s.display();

     krish.disp2();//Calling Using Interface
    }
}
