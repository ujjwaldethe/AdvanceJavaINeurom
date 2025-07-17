package Arrays;

import java.util.Arrays;

public class RotateElementIsIntoLeft {
    public static void rotateLeft(int[] ar,int times)
    {
        for (int i=0;i<times;i++)
        {
            int temp = ar[0];
            for (int j=0;j<ar.length-1;j++)
            {
                ar[j]=ar[j+1];
            }
            ar[ar.length-1]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,2,-4,32,-5,-6};
        rotateLeft(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
