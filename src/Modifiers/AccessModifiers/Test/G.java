package Modifiers.AccessModifiers.Test;

import Modifiers.AccessModifiers.Protected.D;

public class G extends D {
    public static void main(String[] args) {
        G a2 = new G();
        G.test();
        System.out.println(a2.a);
        a2.test();


    }
}
