package Modifiers.AccessModifiers.Test;

import Modifiers.AccessModifiers.Protected.D;

public class F {
    public static void main(String[] args) {
        D d = new D();
        //d.test(); :->Protected (Cannot Be Accessed Without Inheriting From Different Package)
    }
}
