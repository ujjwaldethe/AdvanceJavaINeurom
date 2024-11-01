package StreamApi;

import java.util.function.Predicate;

class MyPredicate implements Predicate<String>{
    @Override
    public boolean test(String name){
        if(name.length()>=3){
            return true;
        }
        else{
            return false;
        }
    }
}
public class FunctionInterFacePredicate {
    public static void main(String[] args) {
        Predicate<String> p = name -> name.length()>3;
        System.out.println(p.test("10"));
        System.out.println(p.test("3"));
    }
}
