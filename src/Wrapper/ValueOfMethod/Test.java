package Wrapper.ValueOfMethod;

public class Test {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        Boolean b1 = Boolean.valueOf("ujjwal");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(b1);

        Integer i3 = Integer.valueOf("110",2);
        /*
        *  What is "100" in base 5?
           Base 5 number: 1*5² + 0*5¹ + 0*5⁰ = 25 + 0 + 0 = 25
        * */
        System.out.println(i3);
        System.out.println(Character.MAX_RADIX);
        System.out.println(Character.MIN_RADIX);
        System.out.println(i1.intValue());
        System.out.println(i1.floatValue());

    }
}
