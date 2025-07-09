package Arrays;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4,5,6};
        int [] ar2 = {7,8,9,10,11};
        System.out.println(Arrays.toString(zigZag(ar1,ar2)));
    }
    public static int[] zigZag(int[] ar1,int[] ar2)
    {
        int minLength = (ar1.length < ar2.length) ? ar1.length : ar2.length;

        int ans[] = new int[(ar1.length+ar2.length)];
        for(int i =0 ; i < ans.length;i++)
        {
            if(i<minLength)
            {
                ans[i]=ar1[i];
                ans[i+1]=ar2[i];
            }

        }
        return ans;
    }
}
