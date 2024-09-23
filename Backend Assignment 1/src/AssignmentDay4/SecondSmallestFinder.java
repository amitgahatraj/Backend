package AssignmentDay4;

public class SecondSmallestFinder {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 3, 8, 1, 4, 2};

        // Find and print the second smallest element
        int secondSmallest = findSecondSmallest(numbers);
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest element.");
        }
    }

    // Method to find the second smallest element
    public static int findSecondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            // Update smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = num;            // Update smallest
            } else if (num < secondSmallest && num > smallest) {
                secondSmallest = num; // Update second smallest
            }
        }

        return secondSmallest; // Return second smallest value
    }
}

