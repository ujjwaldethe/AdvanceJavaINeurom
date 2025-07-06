package TryCatchHandling;

import java.util.Scanner;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            System.out.println("Connection To Calc App Is Established");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The First Num To Divide");
            int num1 = sc.nextInt();
            System.out.println("Enter The Second Num To Divide");
            int num2 = sc.nextInt();
            int res = num1 / num2;
            System.out.println("The Res Is " + res);
        }catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        }
        System.out.println("Connection Is Terminated");
    }
}
