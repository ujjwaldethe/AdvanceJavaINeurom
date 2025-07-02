package Wrapper.xxxValueMethod;

public class TestApp {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(130);


        // Result = minrange + (total - maxrange -1)


        System.out.println(i.byteValue());
        System.out.println(i.intValue());
        System.out.println(i.shortValue());
        System.out.println(i.floatValue());
        System.out.println(i.doubleValue());
        System.out.println(i.longValue());

        Character c = Character.valueOf('a');
        char c1 = c.charValue();
        System.out.println(c);
        System.out.println(c1);

        Boolean b1 = Boolean.valueOf("ujjwal");
        System.out.println(b1);
        Boolean b2 = Boolean.valueOf("true");
        System.out.println(b2);
        Boolean b3 = Boolean.valueOf("TrUe ");
        System.out.println(b3);
        Boolean b4 = Boolean.valueOf("false");
        System.out.println(b4);
        Boolean b5 = Boolean.valueOf("False");
        System.out.println(b5);
        Boolean b6 = Boolean.valueOf("TRUE");
        System.out.println(b6);
        Boolean b7 = Boolean.valueOf("FALSE");
        System.out.println(b7);


    }
}
