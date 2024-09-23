package AssignmentDay4;

import java.util.Arrays;

public class KLargestElementsFinder {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {3, 1, 5, 12, 2, 11, 15};
        int k = 3; // Number of largest elements to find

        // Find and print the k largest elements
        int[] kLargest = findKLargest(numbers, k);
        System.out.println("The " + k + " largest elements are: " + Arrays.toString(kLargest));
    }

    // Method to find k largest elements
    public static int[] findKLargest(int[] array, int k) {
        // Sort the array in descending order
        Arrays.sort(array);

        // Create an array to hold the k largest elements
        int[] kLargest = new int[k];

        // Fill the kLargest array with the k largest elements
        for (int i = 0; i < k; i++) {
            kLargest[i] = array[array.length - 1 - i]; // Get elements from the end of the sorted array
        }

        return kLargest; // Return the k largest elements
    }
}

