package TryCatchHandling;

import java.util.Scanner;

class Alpha
{
    void alpha()
    {
        System.out.println("Connection To Calc App Is Established");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Num To Divide");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Num To Divide");
        int num2 = sc.nextInt();
        int res = num1 / num2;
        System.out.println("The Res Is " + res);
    }
}
class Beta
{
    void beta()
    {
        Alpha a = new Alpha();
        a.alpha();
    }
}

public class ExceptionEx2 {
    public static void main(String[] args) {
        try
        {
            new Beta().beta();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot Divide By Zer0");
        }
    }
}
