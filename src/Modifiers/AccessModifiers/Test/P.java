package Modifiers.AccessModifiers.Test;
import Modifiers.AccessModifiers.Default.A;
public class P {
    public static void main(String[] args) {
        //A a1 = new A(); // Default Constructor Cannot Be Accessed Outside The Package
        A.test();
    }
}
