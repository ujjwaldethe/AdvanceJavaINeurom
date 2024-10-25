package Interfaces;
interface krish{
    void teaches();
    void writescode();
}
class Student implements krish{
    @Override
    public void teaches() {
        System.out.println("learning java");
    }
    public void writescode()
    {
        System.out.println("Writing Codes");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
     Student s = new Student();
     s.teaches();
     s.writescode();
    }
}
