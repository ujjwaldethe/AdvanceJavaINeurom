package Interfaces.Ex2;

interface ISample
{
    //By default "public and abstract"
    void m1();
    void m2();
}
abstract class SampleImpl implements ISample
{
    @Override
    public void m1()
    {
        System.out.println("Implementation");
    }

}
class SubSampleImpl extends SampleImpl
{
    @Override // indication to compiler that these methods are overridden methods
    public void m2()
    {
        System.out.println("Implementation");
    }
}
public class TestApp {
    public static void main(String[] args) {
        ISample sample = new SubSampleImpl();//Loose Coupling
        sample.m1();
        sample.m2();
    }
}
