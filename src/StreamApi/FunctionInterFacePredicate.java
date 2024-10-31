package StreamApi;

import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>{
    @Override
    public  boolean test(Integer i){
        if(i>20){
            return true;
        }
        else{
            return false;
        }
    }
}
public class FunctionInterFacePredicate {
    public static void main(String[] args) {
        Predicate p = new MyPredicate();
        System.out.println(p.test(10));
        System.out.println(p.test(30));
    }
}
