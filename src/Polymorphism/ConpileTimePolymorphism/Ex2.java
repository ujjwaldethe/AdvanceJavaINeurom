package Polymorphism.ConpileTimePolymorphism;
class Demo {
    public void m1(int... a) //m1(int[] x)=>default statement in switch
    {
        /*
        * Above Method Replaced In This Way
        * public void m1(int[] a)
            {
                System.out.println("int method");
            }
        * */
        System.out.println("Var-args Method");
        int total = 0;
        for(int x : a)
        {
            total+=x;
        }
        System.out.println(total);
    }
    public void m1(int[]... a) //m1(int[][] x)=>default statement in switch
    {
        System.out.println(a);
        for (int[] x : a)
        {
            System.out.println(x);
            for (int y : x)
            {
                System.out.println(y);
            }
        }
    }
    public void m1(int a)
    {
        System.out.println("int method");
    }

}
public class Ex2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1(2);
        d.m1(10,20);//internally jvm do m1(new int[]{10,20}
      
        d.m1(new int[]{10,20,30,40},new int[]{10,20,30,40});
    }
}
