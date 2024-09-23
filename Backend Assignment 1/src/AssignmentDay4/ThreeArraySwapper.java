package AssignmentDay4;

import java.util.Arrays;

public class ThreeArraySwapper {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        // Print original arrays
        System.out.println("Original Arrays:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));

        // Swap the arrays and get the swapped arrays
        int[][] swappedArrays = swapArrays(array1, array2, array3);

        // Print swapped arrays
        System.out.println("Swapped Arrays:");
        System.out.println("Array 1: " + Arrays.toString(swappedArrays[0]));
        System.out.println("Array 2: " + Arrays.toString(swappedArrays[1]));
        System.out.println("Array 3: " + Arrays.toString(swappedArrays[2]));
    }

    // Method to swap three arrays and return them
    public static int[][] swapArrays(int[] array1, int[] array2, int[] array3) {
        // Return a 2D array with swapped references
        return new int[][]{array2, array3, array1}; // array1 is now in the last position
    }
}
