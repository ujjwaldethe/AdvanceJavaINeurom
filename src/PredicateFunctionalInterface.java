import java.util.function.Predicate;
class PredicateFunctinalInterface
{
    public static void main(String[] args)
    {
        int[] arr=  {0,5,3,10,15,20,25,30};
        Predicate<Integer> p1 = i -> i>10;
        Predicate<Integer> p2 = i -> i%2==0;
        Predicate<Integer> p3 = i -> i%2!=0;
        System.out.print("\n Greater than 10 : ");
        m1(p1,arr);
        System.out.print("\n Even  : ");
        m1(p2,arr);
        System.out.print("\n Odd : ");
        m1(p3,arr);
        System.out.print("\n Greater than 10 and Even No : ");
        m1(p1.and(p2),arr);
        System.out.print("\n Greater than 10 Or Even No : ");
        m1(p1.or(p2),arr);
        System.out.print("\n Not Even  : ");
        m1(p2.negate(),arr);

    }
    public static void m1(Predicate<Integer> p , int[] x)
    {
        for(int ele : x)
        {
            if(p.test(ele))
            {
                System.out.print(ele+" ");
            }
        }
    }
}