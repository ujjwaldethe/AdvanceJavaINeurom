package InnerClasses;

public class InnerClassEx1 {
    int num;
    A obj = new A();
    public void show()
    {
        System.out.println("In Show");
        obj.config();
    }
    private class A //Inner Class
    {
        public void config()
        {
            System.out.println("In Config");
        }
    }

    public static void main(String[] args) {
        InnerClassEx1 in = new InnerClassEx1();
        in.show();
        System.out.println();

    }
}
