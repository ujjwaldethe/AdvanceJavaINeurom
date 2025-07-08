package Arrays;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int[] dup = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            dup[i]=arr[i];
        }
        System.out.println(Arrays.toString(dup));
    }
}
