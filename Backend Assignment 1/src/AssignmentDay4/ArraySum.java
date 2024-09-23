package AssignmentDay4;

public class ArraySum {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate and print the sum of the elements
        int sum = calculateSum(numbers);
        System.out.println("The sum of all elements in the array is: " + sum);
    }

    // Method to calculate the sum of array elements
    public static int calculateSum(int[] array) {
        int sum = 0; // Initialize sum

        // Loop through the array and add each element to sum
        for (int num : array) {
            sum += num;
        }

        return sum; // Return the total sum
    }
}
