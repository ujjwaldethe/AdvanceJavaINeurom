import java.util.function.*;

public class FunctionInterface {
    public static void main(String args[]) {
        // Function that takes a String and returns its length as a String
        Function<String, String> f = name -> String.valueOf(name.length());

        // Test the function with a String input
        System.out.println(f.apply("Hello"));  // Output will be "5"

        Function<Integer, Integer> doubleNumber = x -> x * 2;

        // Function to add 3 to the number
        Function<Integer, Integer> addThree = x -> x + 3;

        // Using compose() to combine the functions
        Function<Integer, Integer> combinedFunction = doubleNumber.compose(addThree);

        // Applying the composed function
        System.out.println(combinedFunction.apply(5));


        // Using andThen() to combine the functions
        Function<Integer, Integer> combinedFunction1 = doubleNumber.andThen(addThree);

        // Applying the combined function
        System.out.println(combinedFunction1.apply(5));
    }
}
