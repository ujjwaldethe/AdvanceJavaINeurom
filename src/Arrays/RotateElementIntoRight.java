package Arrays;

import java.util.Arrays;

public class RotateElementIntoRight {
    public static void rotateRight(int ar[],int times){
        for(int i=0;i<times;i++)
        {
            int temp = ar[ar.length-1];
            for(int j=ar.length-1;j>0;j--)
            {
                ar[j]=ar[j-1];
            }
            ar[0]=temp;
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,2,-4,32,-5,-6};
        rotateRight(arr,5);
        System.out.println(Arrays.toString(arr));
    }
}
