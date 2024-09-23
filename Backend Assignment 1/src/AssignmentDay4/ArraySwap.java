package AssignmentDay4;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Print original arrays
        System.out.println("Original Arrays:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // Swap the arrays and get the swapped arrays
        int[][] swappedArrays = swapArrays(array1, array2);

        // Print swapped arrays
        System.out.println("Swapped Arrays:");
        System.out.println("Array 1: " + Arrays.toString(swappedArrays[0]));
        System.out.println("Array 2: " + Arrays.toString(swappedArrays[1]));
    }

    // Method to swap two arrays and return them
    public static int[][] swapArrays(int[] array1, int[] array2) {
        return new int[][]{array2, array1}; // Return a 2D array with swapped references
    }
}

