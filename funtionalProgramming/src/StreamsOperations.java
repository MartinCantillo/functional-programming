
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

    }
}
