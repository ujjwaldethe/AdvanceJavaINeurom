package Modifiers.AccessModifiers.Private;

public class A {
    private int a = 10;
    private A()
    {

    }
    private void test()
    {
        System.out.println("From Class A");
    }

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
    }
}
