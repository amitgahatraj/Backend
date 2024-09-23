package AssignmentDay4;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // Sample array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Copy elements from originalArray to newArray
        int[] newArray = copyArray(originalArray);

        // Print both arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(newArray));
    }

    // Method to copy an array
    public static int[] copyArray(int[] array) {
        // Create a new array of the same length
        int[] newArray = new int[array.length];

        // Copy elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray; // Return the new array
    }
}

