package AssignmentDay4;

import java.util.Arrays;

public class EvenOddSeparator {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 2, 8, 3, 4, 7, 6, 1};

        // Separate even and odd numbers
        int[] separatedArray = separateEvenAndOdd(numbers);

        // Print the result
        System.out.println("Array after separating even and odd numbers: " + Arrays.toString(separatedArray));
    }

    // Method to separate even and odd numbers
    public static int[] separateEvenAndOdd(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        int evenIndex = 0;
        int oddIndex = n - 1;

        // Iterate through the array
        for (int num : array) {
            if (num % 2 == 0) {
                result[evenIndex++] = num; // Place even numbers at the front
            } else {
                result[oddIndex--] = num; // Place odd numbers at the end
            }
        }

        return result; // Return the new array with even and odd separated
    }
}

