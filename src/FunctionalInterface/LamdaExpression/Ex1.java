package FunctionalInterface.LamdaExpression;

@FunctionalInterface
interface Demo
{
    void disp();
}
class Ex1_1 implements Demo{
    public void disp()
    {
        System.out.println("Hellooo");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Demo d = () -> System.out.println("Hello from Lambda!");
        Ex1_1 e = new Ex1_1();
        e.disp();
        d.disp(); // Output: Hello from Lambda!
    }
}
