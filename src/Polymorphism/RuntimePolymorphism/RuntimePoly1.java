package Polymorphism.RuntimePolymorphism;

class Parent1
{
    public void cry()
    {
        System.out.println("Parent Crying");
    }
}
class Child1 extends Parent1
{
    public void cry()
    {
        System.out.println("Child1 Cries At Low Voice");
    }
}
class Child2 extends Parent1
{
    public void cry()
    {
        System.out.println("Child2 Cries At High Voice");
    }
}
public class RuntimePoly1 {
    public static void main(String[] args) {
        int a;
        a=10;
        Child1 c1 = new Child1(); //Tight Coupling
        Child2 c2 = new Child2(); // Tight Coupling
        Parent1 ref;
        ref = c1;//Loose Coupling
        ref.cry();//Loose Coupling
        c1.cry();
        c2.cry();
        ref = c2;//Loose Coupling
        ref.cry(); //Loose Coupling

    }
}
