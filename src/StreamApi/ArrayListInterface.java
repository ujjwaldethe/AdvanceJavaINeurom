package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

class MyConsumer implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
public class ArrayListInterface {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ujjwal");
        names.add("krishna");
        names.add("dethe");





    //  names.forEach(new MyConsumer());
        //Traditional Approach
        System.out.println("\nTraditional Approach");
        Consumer<String> con = new MyConsumer();
        names.forEach(con);

        System.out.println("\nLamda Expression");
        //Lamda Expression
        names.forEach(name->System.out.println(name));

        System.out.println("\nMethod reference");
        //method reference
        names.forEach(System.out::println );
    }

}
