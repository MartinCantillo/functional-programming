
import dtos.PersonDto;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import models.Person;

public class StreamsOperations {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Alice", "Smith", "alice.smith@example.com");
        Person person2 = new Person(2, "Bob", "Johnson", "bob.johnson@example.com");
        Person person3 = new Person(3, "Charlie", "Brown", "charlie.brown@example.com");
        Person person4 = new Person(4, "Diana", "Adams", "diana.adams@example.com");
        Person person5 = new Person(5, "Ethan", "Clark", "ethan.clark@example.com");

        /**
         * Streams api allows to work with collections
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filter(): Filters the elements that match a condition
        Predicate<Integer> IsEven = (x) -> x % 2 == 0;
        List<Integer> evenNumbers = numbers.stream().filter(IsEven).collect(Collectors.toList());

        System.out.println(evenNumbers);

        // map(): Transforms the elements into another form
        List<Person> persons = Arrays.asList(person1, person2, person3, person4, person5);

        Function<Person, PersonDto> personDto = x -> new PersonDto(x.getName(), x.getEmail());

        List<PersonDto> personsDtos = persons.stream().map(personDto).collect(Collectors.toList());

        System.out.println(personsDtos);

          // distinct(): Removes duplicates
          List<Integer> distinctNumbers = Arrays.asList(1, 2, 2, 3, 3, 4);
          List<Integer> uniqueNumbers = distinctNumbers.stream()
                                                       .distinct()
                                                       .collect(Collectors.toList());
          System.out.println("Distinct numbers: " + uniqueNumbers);

           // forEach(): Applies an action to each element of the Stream
        System.out.print("Numbers: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // collect(): Collects the elements into a collection like a list or set
        List<Integer> collectedNumbers = numbers.stream()
                                                 .collect(Collectors.toList());
        System.out.println("Collected numbers: " + collectedNumbers);

        // reduce(): Combines the elements of a Stream into a single value
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);  // Sum all elements
        System.out.println("Sum of numbers: " + sum);

        // count(): Counts the number of elements
        long count = numbers.stream()
                            .count();
        System.out.println("Count of numbers: " + count);

        // anyMatch(), allMatch(), noneMatch(): Performs match tests
        boolean hasEven = numbers.stream()
                                 .anyMatch(n -> n % 2 == 0);  // Check if any number is even
        boolean allEven = numbers.stream()
                                 .allMatch(n -> n % 2 == 0);  // Check if all numbers are even
        boolean noEven = numbers.stream()
                                .noneMatch(n -> n % 2 == 0);  // Check if no number is even
        
        System.out.println("Any even number? " + hasEven);
        System.out.println("All even numbers? " + allEven);
        System.out.println("No even numbers? " + noEven);

    }
}
