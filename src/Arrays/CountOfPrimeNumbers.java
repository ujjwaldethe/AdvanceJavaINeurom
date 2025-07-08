package Arrays;

public class CountOfPrimeNumbers {
    public static boolean isPrime(int num)
    {
        if(num==0 || num==1)
            return false;
        if(num==2)
            return true;
        for(int i = 2 ; i <= Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static int primeCount(int arr[])
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,7,8,98,3,3,3,3,3};
        System.out.println(primeCount(arr));
    }
}
