package Wrapper.AutoBoxingAndAutoUnBoxing;

public class TestCase {
    public static void main(String[] args) {

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println(i1==i2);

        Integer i3 = 10;
        Integer i4 = 10;
        System.out.println(i3==i4);

        Integer i5 = Integer.valueOf(10);
        Integer i6 = Integer.valueOf(10);
        System.out.println(i5==i6);


        Integer i7 =  10;
        Integer i8 = Integer.valueOf(10);
        System.out.println(i7==i8);

    }
}
