package AssignmentDay4;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Sample array with duplicates
        int[] numbers = {1, 2, 3, 4, 2, 5, 3, 6, 1};

        // Remove duplicates
        int[] uniqueNumbers = removeDuplicates(numbers);

        // Print the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueNumbers));
    }

    // Method to remove duplicates
    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the set to eliminate duplicates
        for (int num : array) {
            set.add(num);
        }

        // Convert the set back to an array
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
