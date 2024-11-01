package StreamApi;

import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>{
    @Override
    public boolean test(Integer name){
        if(name>23){
            return true;
        }
        else{
            return false;
        }
    }
}
public class FunctionInterFacePredicate {
    public static void main(String[] args) {
        int arr[]={0,5,10,15,20,25};
        Predicate<Integer> p = name -> name>= 23;
        Predicate<Integer> p2 = name -> name%2==0;
        Predicate<Integer> p3 = name -> name%2==0;
        System.out.println(p.test(10));
        System.out.println(p.test(3));

        System.out.println("Greater Then 23");
        for(int ele:arr){
            if(p.test(ele))
            {
                System.out.println(ele);
            }
        }
        System.out.println("Even : ");
        for(int ele:arr){
            if(p2.test(ele))
            {
                System.out.println(ele);
            }
        }

        System.out.println("Even(Negate) : ");
        for(int ele:arr){
            if (p3.negate().test(ele)) {

                System.out.println(ele);
            }
        }

        System.out.println("Even (And): ");
        for(int ele:arr){
            if (p3.and(p).test(ele)) {

                System.out.println(ele);
            }
        }
        System.out.println("Even(OR) : ");
        for(int ele:arr){
            if (p3.or(p).test(ele)) {

                System.out.println(ele);
            }
        }

    }
}
