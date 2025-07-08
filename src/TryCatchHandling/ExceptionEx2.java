package TryCatchHandling;

import java.util.Scanner;

class Alpha
{
    void alpha()
    {
        System.out.println("Connection To Calc App Is Established");
        Scanner sc = new Scanner(System.in);
        try{

            System.out.println("Enter The First Num To Divide");
            int num1 = sc.nextInt();
            System.out.println("Enter The Second Num To Divide");
            int num2 = sc.nextInt();
            int res = num1 / num2;
            System.out.println("The Res Is " + res);
        }
        catch (ArithmeticException e)
        {
            throw e;
        }
    }
}
class Beta
{
    void beta()
    {
        Alpha a = new Alpha();
        a.alpha();
        System.out.println("Beta Class");
    }
}

public class ExceptionEx2 {
    public static void main(String[] args) {
        try {

        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("1");
        }

    }

}
