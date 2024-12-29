
import java.util.*;
import java.util.function.Consumer;
import models.Person;

public class ReferencesMethod {
public static void main(String[] args) {


    /**static method references (class::Staticmethod) = is the same a instance method references*/

    List<String> names= Arrays.asList("Martin","Camilo","Andres");

   /**Person=class , printNames= method */
    Consumer<String>printer=Person::printNames;
    
    names.forEach(printer);
    
}
}
