package AssignmentDay4;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to remove: ");
        int valueToRemove = scanner.nextInt();

        // Initialize a new array with one less element
        int[] newArray = new int[size - 1];
        boolean found = false;
        int j = 0;

        // Loop through the original array
        for (int i = 0; i < size; i++) {
            if (array[i] == valueToRemove && !found) {
                // Skip the element to be removed
                found = true;
            } else {
                // Copy elements to new array
                if (j < newArray.length) {
                    newArray[j++] = array[i];
                }
            }
        }

        if (found) {
            System.out.println("Array after removing " + valueToRemove + ":");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("The value " + valueToRemove + " was not found in the array.");
        }

        scanner.close();
    }
}

