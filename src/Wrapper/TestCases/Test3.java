package Wrapper.TestCases;

public class Test3 {
    public static void methodOne(Integer i){
        System.out.println("Auto-Boxing");
    }
    public static void methodOne(int... i) {
        System.out.println("Var-args Method");
    }
    public static void main(String[] args) {
        int x = 10;
        methodOne(x);
        methodOne(x,x);

    }
}
