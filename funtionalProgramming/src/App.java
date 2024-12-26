 import interfaces.FunctionR2R;
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
    }
}
