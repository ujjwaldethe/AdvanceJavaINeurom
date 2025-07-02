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

    }
}
