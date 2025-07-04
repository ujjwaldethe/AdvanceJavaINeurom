package Wrapper.TestCases;

public class Test2 {
    public static void methodOne(long i){
        System.out.println("Widening");
    }
    public static void methodOne(int... i){
        System.out.println("Var-args method");
    }
    public static void main(String[] args) {
        int x = 10;
        methodOne(x);
    }
}
