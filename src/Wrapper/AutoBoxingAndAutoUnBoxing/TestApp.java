package Wrapper.AutoBoxingAndAutoUnBoxing;

interface test{

    default void dis()
    {
        System.out.println("Hello");
        display();
    }
    private void display()
    {
        System.out.println("Hi");
    }
}
public class TestApp implements  test {

    public static void main(String[] args) {
        TestApp obj = new TestApp(); // create object
        obj.dis();
    }

}
