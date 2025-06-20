package Polymorphism.RuntimePolymorphism;

import java.sql.SQLOutput;

class Parents
{
    public void cry()
    {
        System.out.println("Parents Crying");
    }
}
class Child11 extends Parents
{
    public void cry()
    {
        System.out.println("Child1 Crying");
    }
    public void eat()
    {
        System.out.println("Child 1 Is Eating");
    }
}
class Child12 extends Parents
{
    public void cry()
    {
        System.out.println("Child 2 Crying");
    }
    public void eat()
    {
        System.out.println("Child 2 Is Eating" );
    }
}
public class RuntimePoly3 {
    public static void main(String[] args) {
        Parents p1 = new Child11();
        Parents p2 =new Child12();
        p1.cry();
        ((Child11)p1).eat();
        p2.cry();
        ((Child12)p2).eat();
    }
}
