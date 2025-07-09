package Arrays;
import java.util.Arrays;

public class MergeAndFirstHalfReverse {
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4,5,6};
        int [] ar2 = {7,8,9};
        System.out.println(Arrays.toString(mergeArray(ar1,ar2)));
    }
    public static int[] mergeArray(int[] ar1,int[] ar2)
    {
        int ans[] = new int[(ar1.length+ar2.length)];
        for(int i =0 ; i < ans.length;i++)
        {
            if(i<ar1.length)
            {
                ans[i]=ar1[ar1.length-i-1];
            }
            else
            {
                ans[i]=ar2[i-ar1.length];
            }
        }
        return ans;
    }
}
