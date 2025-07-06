package Modifiers.AccessModifiers.Default;

public class A {
    int a = 10;
    A()
    {

    }
    public static void test()
    {
        System.out.println("From Default test() Of A");
    }

    public static void main(String[] args) {
        A a1 = new A();
        A.test();
        System.out.println(a1.a);
    }
}
