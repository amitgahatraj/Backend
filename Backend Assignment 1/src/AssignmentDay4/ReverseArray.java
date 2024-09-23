package AssignmentDay4;

public class ReverseArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements in reverse order
        printArrayInReverse(numbers);
    }

    // Method to print array elements in reverse order
    public static void printArrayInReverse(int[] array) {
        System.out.println("Array elements in reverse order:");

        // Loop from the end of the array to the beginning
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // For a new line after printing
    }
}
