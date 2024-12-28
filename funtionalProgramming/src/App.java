 import interfaces.FunctionR2R;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class App {
    public static void main(String[] args)  {
       
        FunctionR2R sqr=x->x*x;
        System.out.println(sqr.valueAt(4));


        /** funtional interfaces  */

        /**Predicate interface returns a boolean value,
         * Predicate has a only abstract method named test
        */
        Predicate<Integer> isEven=x->x%2==0;

        System.out.println(isEven.test(5));


        /**Funtion interface returns a type of object
         * Function has a only abstract method named apply
          */
          Function<Integer,Double> square=x->(double)x*x;//I want to return a value of type double and I a  input int value 
          System.out.println(square.apply(4));

        // The Consumer interface in Java represents an operation that takes a single input argument 
        // and does not return a result. It is often used for performing side effects, 
        // such as logging, printing, or modifying external state.
          Consumer<String> printString = s -> System.out.println(s);

          printString.accept("Hello World");


          //Another example de consumer , i will use it for printing the list

          List<String> names= Arrays.asList("Martin","Camilo","Andres");
        
          names.forEach(printString);

    }
}
