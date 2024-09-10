package AssignmentDay4;

import java.util.Scanner;
public class ArrayContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int valueToSearch = scanner.nextInt();

        boolean found = false;

        for (int num : array) {
            if (num == valueToSearch) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("The array contains the value " + valueToSearch);
        } else {
            System.out.println("The array does not contain the value " + valueToSearch);
        }

        scanner.close();
    }
}

