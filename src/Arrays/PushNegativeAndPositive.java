package Arrays;

import java.util.Arrays;

public class PushNegativeAndPositive {
    public static int[] pushNegativeAndPositive(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = {10,2,-4,32,-5,-6};
        System.out.println(Arrays.toString(pushNegativeAndPositive(arr)));
    }
}
