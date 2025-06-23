package InnerClasses;

class A
{
    public void show()
    {
        System.out.println("In Class A");
    }
    class B //Inner Class : It Is A Design Pattern.
    {
        public void config()
        {
            System.out.println("In Class B");
        }
    }
}

public class InnerClassEx2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B b = obj.new B();
        b.config();
    }
}
