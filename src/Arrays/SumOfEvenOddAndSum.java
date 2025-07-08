package Arrays;

public class SumOfEvenOddAndSum {
    public static int SumOfEven(int arr[])
    {
        int evenSum = 0 ;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evenSum+=arr[i];
            }
        }
        return evenSum;
    }
    public static int SumOfOdd(int arr[])
    {
        int oddSum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                oddSum+=arr[i];
            }
        }
        return oddSum;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,45,32,54,23,76};
        System.out.println("Even Sum : "+SumOfEven(arr)+"\n"+"Odd Sum : "+SumOfOdd(arr)+"\n"+"Both Sum Is "+((SumOfOdd(arr)==SumOfEven(arr))?"Same":"Not Same"));
    }
}
