package InnerClasses;

abstract class Computer1
{
    public abstract void config();
}
class Laptop extends  Computer
{
    @Override
    public void config()
    {
        System.out.println("It Is Working");
    }
}
public class InnerClassEx4 {
    public static void main(String[] args) {
        Computer1 comp = new Computer1()
        {
            public void config()
            {
                System.out.println("Something New");
            }
        };
        comp.config();
    }
}
/*
*
* */