package Arrays.Search;

import Arrays.Sort.BubbleSort;

import java.util.Arrays;

public class BinarySearch {
    public static void binarySearch(int arr[],int search)
    {
        int start = 0;
        int end = arr.length-1;
        int mid;
        while (start<=end)
        {
            mid = (start+end)/2;
            if(search==arr[mid])
            {
                System.out.println("Element "+arr[mid]+" At Index "+mid);
                break;
            }
            else if(search>arr[mid])
            {
                start=mid+1;
            }
            else if(search<arr[mid])
            {
                end=mid-1;
            }
        }
        if (start>end)
        {
            System.out.println("Element Not Found");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,2,-4,32,-5,-6};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        binarySearch(arr,10);
    }
}
