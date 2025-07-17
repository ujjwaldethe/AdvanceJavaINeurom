package Arrays;

import java.util.Arrays;

public class MakeArrayIntoPositive {
    public static int[] makeArrayIntoPositive(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
                arr[i]=-arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,-2,-5,-7,34,54,23,54};
        System.out.println(Arrays.toString(makeArrayIntoPositive(arr)));
    }
}
