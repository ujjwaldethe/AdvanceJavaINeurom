package Interfaces.AdapterClass;


interface IDemo
{
    // SRS (100% Abstract)
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
    void m6();
}
abstract class AdapterClass implements IDemo
{
    public void m1(){};
    public void m2(){};
    public void m3(){};
    public void m4(){};
    public void m5(){};
    public void m6(){};
}
class DemoImpl extends AdapterClass
{
    public void m3()
    {

    }
}
public class TestApp {
    public static void main(String[] args) {

    }
}
