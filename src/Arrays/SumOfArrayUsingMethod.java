package Arrays;

public class SumOfArrayUsingMethod {
    public static int SumOfArray(int arr[])
    {
        int sum =0;
        for(int i =0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println(SumOfArray(arr));
    }
}
