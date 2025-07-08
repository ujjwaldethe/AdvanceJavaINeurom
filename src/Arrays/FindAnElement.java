package Arrays;

import java.util.Scanner;

public class FindAnElement {
    public static boolean isFound(int arr[],int ele)
    {
        for(int i=0; i < arr.length;i++)
        {
            if(arr[i]==ele)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,3,54,3,4,54,5,45,4,5,45,4,5,4,1};
        int ele;
        System.out.println("Enter Element To Search : ");
        ele=new Scanner(System.in).nextInt();
        System.out.println(isFound(arr,ele));
    }
}
