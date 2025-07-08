package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println(Arrays.toString(ReverseArray(arr)));
    }
    public static int[] ReverseArray(int[] arr)
    {
        int dup[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            dup[i]=arr[arr.length-1-i];
        }
        return dup;
    }
}
