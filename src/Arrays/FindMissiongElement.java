package Arrays;

public class FindMissiongElement {
    public static void findMissiongElement(int []arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i < arr.length ; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            for (int j=min;j<max;j++)
            {
                if (arr[i]!=min){
                    System.out.print(min+" ");
                }
                min++;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
   findMissiongElement(arr);
    }
}
