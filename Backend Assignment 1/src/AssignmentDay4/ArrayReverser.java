
//6) Write a Java program to reverse an array of integer values

package AssignmentDay4;

public class ArrayReverser {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Print original array
        System.out.println("Original array:");
        printArray(numbers);

        // Reverse the array
        reverseArray(numbers);

        // Print reversed array
        System.out.println("Reversed array:");
        printArray(numbers);
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int left = 0; // Starting index
        int right = array.length - 1; // Ending index

        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

