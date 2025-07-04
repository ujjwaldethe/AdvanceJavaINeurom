package Wrapper.TestCases;

public class Test5 {

    public static void methodOne(Number i){
        System.out.println("Number Class");
    }
    public static void main(String[] args) {
        int x = 10;
        methodOne(x);//Error
    }
}
