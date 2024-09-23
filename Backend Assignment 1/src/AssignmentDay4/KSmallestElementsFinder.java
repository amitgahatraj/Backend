package AssignmentDay4;

import java.util.Arrays;

public class KSmallestElementsFinder {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {7, 10, 4, 3, 20, 15};
        int k = 3; // Number of smallest elements to find

        // Find and print the k smallest elements
        int[] kSmallest = findKSmallest(numbers, k);
        System.out.println("The " + k + " smallest elements are: " + Arrays.toString(kSmallest));
    }

    // Method to find k smallest elements
    public static int[] findKSmallest(int[] array, int k) {
        // Sort the array in ascending order
        Arrays.sort(array);

        // Create an array to hold the k smallest elements
        int[] kSmallest = new int[k];

        // Fill the kSmallest array with the k smallest elements
        for (int i = 0; i < k; i++) {
            kSmallest[i] = array[i]; // Get elements from the start of the sorted array
        }

        return kSmallest; // Return the k smallest elements
    }
}
