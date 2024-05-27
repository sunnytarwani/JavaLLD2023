package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "hi" , "Home" ,"world", "java", "stream");


        List<Integer> temp = List.of(1,2,3,4,5);
//        List<Integer> result =
        temp.stream()
                .map(a->a*2)
                .forEach(i -> System.out.println(i));

        //System.out.println(result);


        //filter
        List<String> ans = words.stream()
                .filter(a -> a.toLowerCase().startsWith("h"))
                .collect(Collectors.toList());

        System.out.println(ans);



        //map
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Words in uppercase: " + upperCaseWords);



        //reduce
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        // Calculate the sum of numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sum);


        //distinct
        // Remove duplicates
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct numbers: " + distinctNumbers);



        //sorted
        List<String> names = Arrays.asList("Charlie", "Alice", "David", "Bob");
        // Sort names alphabetically
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted names: " + sortedNames);
    }
}
