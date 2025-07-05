package MethodShadowing;

class Parent
{
    public static void disp()
    {
        System.out.println("Hello Parent");
    }
}
class Child1 extends Parent{
    public static void disp()
    {
        System.out.println("Hello Child");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Parent p = new Child1();
        p.disp();
    }
}
