package AssignmentDay4;

import java.util.HashSet;

public class CommonElementsFinder {
    public static void main(String[] args) {
        // Sample arrays of strings
        String[] array1 = {"apple", "banana", "orange", "kiwi"};
        String[] array2 = {"banana", "grape", "kiwi", "mango"};

        // Find and print common elements
        findCommonElements(array1, array2);
    }

    // Method to find common elements
    public static void findCommonElements(String[] array1, String[] array2) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> commonElements = new HashSet<>();

        // Add elements of the first array to the set
        for (String str : array1) {
            set1.add(str);
        }

        // Check for common elements in the second array
        for (String str : array2) {
            if (set1.contains(str)) {
                commonElements.add(str);
            }
        }

        // Print common elements
        if (commonElements.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements: " + commonElements);
        }
    }
}
