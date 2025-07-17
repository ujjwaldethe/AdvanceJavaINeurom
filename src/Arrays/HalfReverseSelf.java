package Arrays;

import java.util.Arrays;

public class HalfReverseSelf {
    public static int[] reverseArray(int arr[])
    {
        int i = 0;
        int j = arr.length-1;
        while(i<j)
        {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        System.out.println(Arrays.toString(reverseArray(arr)));

    }
}
