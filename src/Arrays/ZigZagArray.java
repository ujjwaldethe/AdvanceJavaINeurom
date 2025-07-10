package Arrays;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4,5,6,7,8};
        int [] ar2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(zigZag(ar1,ar2)));
    }
    public static int[] zigZag(int[] ar1,int[] ar2) {
        int minLength = (ar1.length < ar2.length) ? ar1.length : ar2.length;
        int ans[] = new int[(ar1.length+ar2.length)];
        int n1=0,n2=1,extra=minLength;
        for(int i=0;i<ans.length;i++) {
            if(i<minLength) {
                 ans[n1]=ar1[i];
                 ans[n2]=ar2[i];
                 n1+=2;
                 n2+=2;
            }
            else {
                if (ar1.length > minLength&& extra < ar1.length) {
                    ans[n1] = ar1[extra];
                    n1++;
                } else if (ar2.length >minLength && extra < ar2.length) {
                    System.out.println(n2);
                    ans[n2-1] = ar2[extra];
                    n2++;
                }
                extra++;}
        }return ans;
    }
}
