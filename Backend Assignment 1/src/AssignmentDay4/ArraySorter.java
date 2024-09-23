package AssignmentDay4;

import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 3, 8, 1, 4, 7, 2, 6};

        // Sort the array
        sortArrayAscending(numbers);

        // Print the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
    }

    // Method to sort an array in ascending order
    public static void sortArrayAscending(int[] array) {
        Arrays.sort(array); // Use the built-in sort method
    }
}

