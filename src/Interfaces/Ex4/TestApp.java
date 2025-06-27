package Interfaces.Ex4;



interface Idemo1
{
    void m1();
}
interface Idemo2
{
    void m2();
}
interface Idemo3 extends Idemo2 ,Idemo1{
    void m3();
}
class SampleImpl implements Idemo3{
    @Override
    public void m1()
    {
        System.out.println("I1");
    }
    @Override
    public void m2()
    {
        System.out.println("I2");
    }
    @Override
    public void m3()
    {
        System.out.println("I3 ");
    }
}
public class TestApp{
    public static void main(String[] args) {

    }
}
