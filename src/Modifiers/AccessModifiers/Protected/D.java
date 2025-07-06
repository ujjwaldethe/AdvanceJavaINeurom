package Modifiers.AccessModifiers.Protected;

public class D {
    protected int a = 10;
    public D()
    {

    }
    protected static void test()
    {
        System.out.println("From Protected method test of class D");
    }
    protected void test(int a)
    {
        System.out.println("From Protected method test of class D");
    }

    public static void main(String[] args) {
        D d1 = new D();
        System.out.println(d1.a);
        test();
    }
}
