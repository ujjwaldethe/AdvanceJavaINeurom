package Arrays;

public class CountOfOddEven {
    public static int[] countOfEvenOdd(int arr[]) {
        int evenCount = 0 ;
        int oddCount = 0 ;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) {
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        int counts[]={evenCount,oddCount};
        return counts;
    }
    public static void main(String[] args) {
        int[]arr = {10,20,30,50,60,3};
        int[] res = countOfEvenOdd(arr);
        System.out.println("Even Count : "+res[0]+"\nOdd Count : "+res[1]);
    }
}
