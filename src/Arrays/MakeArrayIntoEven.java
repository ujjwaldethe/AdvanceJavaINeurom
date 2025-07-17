package Arrays;

import java.util.Arrays;

public class MakeArrayIntoEven {
    public static int[] makeArrayIntoEven(int arr[])
    {
        for(int i=0; i < arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                arr[i]=++arr[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {9,2,4,7,5,3};
        System.out.println(Arrays.toString(makeArrayIntoEven(arr)));
    }
}
