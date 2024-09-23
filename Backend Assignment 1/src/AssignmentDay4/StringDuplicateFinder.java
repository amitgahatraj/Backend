//8) Write a Java program to find the duplicate values of an array of
//string values
package AssignmentDay4;

import java.util.HashSet;

public class StringDuplicateFinder {
    public static void main(String[] args) {
        // Sample array of strings
        String[] strings = {"apple", "banana", "orange", "apple", "kiwi", "banana", "grape"};

        // Find and print duplicates
        findDuplicates(strings);
    }

    // Method to find duplicates
    public static void findDuplicates(String[] array) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String str : array) {
            // If the string is already in the 'seen' set, it's a duplicate
            if (seen.contains(str)) {
                duplicates.add(str);
            } else {
                seen.add(str);
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
