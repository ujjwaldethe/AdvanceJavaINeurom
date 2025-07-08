package Arrays;

public class CheckPalindrone {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,0};
        System.out.println(isPalindrone(arr));
    }
    public static boolean isPalindrone(int arr[]){
        for (int i = 0 ; i < (arr.length)/2;i++){
            if(arr[i]!=arr[arr.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
