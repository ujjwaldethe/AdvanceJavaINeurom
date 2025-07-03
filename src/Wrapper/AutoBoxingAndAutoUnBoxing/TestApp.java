package Wrapper.AutoBoxingAndAutoUnBoxing;

public class TestApp {
    static Integer i1 = 10;
    public static void main(String[] args){
        int i2 = i1;
        m1(i2);
    }
    public static void m1(Integer i2){
        int k = i2;
        System.out.println(k);
    }
}
