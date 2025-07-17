package Arrays.Search;

public class LinearSearch {
    public static void linearSearch(int arr[],int search)
    {
        boolean flag = false;
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                flag=true;
                break;
            }
        }
        System.out.println(flag?"Element Found":"Element Not Found");

    }
    public static void main(String[] args) {
        int arr[] = {10,2,-4,32,-5,-6};
        linearSearch(arr,0);
    }
}
