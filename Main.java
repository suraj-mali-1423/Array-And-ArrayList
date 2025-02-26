import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Example of using command-line arguments
        System.out.println("Command-line arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }

        // Example of using an array
        int[] numbers = {5, 3, 1, 4, 2};
        System.out.println("\nOriginal array: " + Arrays.toString(numbers));

        // Sorting the array using Arrays.sort()
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Example of using ArrayList
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("\nOriginal ArrayList: " + languages);

        // Sorting the ArrayList using Collections.sort()
        Collections.sort(languages);
        System.out.println("Sorted ArrayList: " + languages);

        // Removing an element from ArrayList
        languages.remove("C++");
        System.out.println("ArrayList after removing 'C++': " + languages);

        // Accessing an element by index
        System.out.println("Element at index 1: " + languages.get(1));

        // Checking the size of the ArrayList
        System.out.println("Size of ArrayList: " + languages.size());
    }
}