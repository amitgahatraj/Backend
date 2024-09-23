package AssignmentDay4;

import java.util.Arrays;

public class ArraySwapper {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Print original arrays
        System.out.println("Original Arrays:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // Swap the arrays
        swapArrays(array1, array2);

        // Print swapped arrays
        System.out.println("Swapped Arrays:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    // Method to swap two arrays using a temporary variable
    public static void swapArrays(int[] array1, int[] array2) {
        int[] temp = array1; // Use a temporary variable to hold the reference of array1
        array1 = array2;     // Point array1 to array2
        array2 = temp;       // Point array2 to the original array1

    }
}
