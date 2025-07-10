package Arrays;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4,5,6,6};
        int [] ar2 = {7,8,9,10,11};
        System.out.println("test");
        System.out.println(Arrays.toString(zigZag(ar1,ar2)));
        System.out.println("test");
    }
    public static int[] zigZag(int[] ar1,int[] ar2)
    {
        int minLength = (ar1.length < ar2.length) ? ar1.length : ar2.length;
        int ans[] = new int[(ar1.length+ar2.length)];
       int mem = 0,n1=0,n2=0;
       for(int i=0;i<ans.length;i++)
       {
           if(i<minLength && i%2==0)
           {
               ans[i]=ar1[n1];
               n1++;
           }
           if(i<minLength && i%2!=0)
           {
               ans[i]=ar2[n2];
               n2++;
           }

//           if(i>minLength)
//           {
//               if(ar1.length> minLength)
//               {
//                   System.out.println(mem);
//                   ans[i]=ar1[mem-1];
//
//               }
//               else
//               {
//                   ans[i]=ar2[mem-1];
//               }
//
//           }
       }
        return ans;
    }
}
