package AssignmentDay4;

//7) Write a Java program to find the duplicate values of an array of
//integer values

import java.util.HashSet;

public class DuplicateFinder {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5, 6, 3, 2, 1, 7, 8};

        // Find and print duplicates
        findDuplicates(numbers);
    }

    // Method to find duplicates
    public static void findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            // If the number is already in the 'seen' set, it's a duplicate
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        // Print duplicates
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate values: " + duplicates);
        }
    }
}

