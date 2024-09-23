package AssignmentDay4;

public class EvenPositionArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        // Print the elements at even positions
        printEvenPositionElements(numbers);
    }

    // Method to print elements at even positions
    public static void printEvenPositionElements(int[] array) {
        System.out.println("Elements at even positions:");

        // Loop through the array, considering even indices
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // For a new line after printing
    }
}
