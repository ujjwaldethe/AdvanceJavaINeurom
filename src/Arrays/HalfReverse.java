package Arrays;

import java.util.Arrays;

public class HalfReverse {
    public static int[] reverseArrayInhalf(int arr[])
    {
       int i = (arr.length)/2;
       int j = arr.length-1;
       int temp;
       while(i<j)
       {
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        System.out.println(Arrays.toString(reverseArrayInhalf(arr)));

    }
}
