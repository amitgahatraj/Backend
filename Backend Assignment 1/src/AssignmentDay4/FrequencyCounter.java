package AssignmentDay4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 5, 5, 1};

        // Find and print the frequency of each element
        findFrequency(numbers);
    }

    // Method to find the frequency of each element
    public static void findFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
