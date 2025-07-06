package Modifiers.AccessModifiers.Protected;

public class E {
    public static void main(String[] args) {
        D d2 = new D();
        System.out.println(d2.a);
        D.test();
    }
}
