package Arrays;

import java.util.Scanner;

public class CountOfRepeatedElements {
    public static int Count(int arr[],int ele){
        int count = 0;
        for (int i = 0; i < arr.length ;i++) {
            if (arr[i]==ele) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,6,4,34,3,43,43,43,4,3,};
        System.out.println("\nEnter Element To Search : ");
        int ele = new Scanner(System.in).nextInt();
        System.out.println(Count(arr,ele));
    }
}
