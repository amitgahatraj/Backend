package AssignmentDay4;

public class OddPositionArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        // Print the elements at odd positions
        printOddPositionElements(numbers);
    }

    // Method to print elements at odd positions
    public static void printOddPositionElements(int[] array) {
        System.out.println("Elements at odd positions:");

        // Loop through the array, considering odd indices
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // For a new line after printing
    }
}

