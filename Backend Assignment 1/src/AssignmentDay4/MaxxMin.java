package AssignmentDay4;

public class MaxxMin {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 1, 8, 4, 2, 9, 6};

        // Initialize max and min with the first element of the array
        int max = numbers[0];
        int min = numbers[0];

        // Iterate through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update min
            }
        }

        // Output the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
