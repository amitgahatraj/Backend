package AssignmentDay4;

import java.util.Arrays;
import java.util.Collections;

public class DescendingArraySorter {
    public static void main(String[] args) {
        // Sample array
        Integer[] numbers = {5, 3, 8, 1, 4, 7, 2, 6};

        // Sort the array in descending order
        sortArrayDescending(numbers);

        // Print the sorted array
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }

    // Method to sort an array in descending order
    public static void sortArrayDescending(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }
}
