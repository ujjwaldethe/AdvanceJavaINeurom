package Interfaces.Ex3;

interface One
{
    void m1();
}
interface Two extends One
{
    void m2();
}
abstract class Three implements Two
{
    void m3()
    {
        System.out.println("Hello 3");
    }
}
class four extends Three implements One,Two
{
    @Override
    public void m1()
    {
        System.out.println("Hello 1");
    }
    @Override
    public void m2()
    {
        System.out.println("Hello 2");
    }
}

public class TestApp {
    public static void main(String[] args) {
        Three one = new four();
        one.m1();
        one.m2();
        one.m3();
    }
}
