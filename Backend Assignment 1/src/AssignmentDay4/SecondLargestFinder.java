package AssignmentDay4;

public class SecondLargestFinder {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 7, 2, 8, 3, 10, 6};

        // Find and print the second largest element
        int secondLargest = findSecondLargest(numbers);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }
    }

    // Method to find the second largest element
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num; // Update second largest
            }
        }

        return secondLargest; // Return second largest value
    }
}
