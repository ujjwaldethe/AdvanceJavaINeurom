package Interfaces.Ex6;

interface I1
{
    int x = 10;
    void m1();
}
interface I2
{
    int x = 20;
    void m1();
}
public class TestApp implements I1,I2 {
    @Override
    public void m1()
    {

    }
    public static void main(String[] args) {
        System.out.println(I1.x);
        System.out.println(I2  .x);
    }
}
