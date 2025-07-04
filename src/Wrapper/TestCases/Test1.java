package Wrapper.TestCases;

public class Test1 {
    public static void methodOne(long l){
        System.out.println("Widening");
    }
    public static void methodOne(Integer i){
        System.out.println("Auto-Boxing");
    }
    public static void main(String[] args) {
        int x = 10;
        methodOne(x);
    }
}
