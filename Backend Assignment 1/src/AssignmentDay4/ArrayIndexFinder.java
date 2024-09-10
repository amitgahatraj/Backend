package AssignmentDay4;
import java.util.Scanner;

public class ArrayIndexFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to find its index: ");
        int valueToSearch = scanner.nextInt();

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] == valueToSearch) {
                index = i;
                break;
            }
        }

        // Display the result
        if (index != -1) {
            System.out.println("The index of the value " + valueToSearch + " is: " + index);
        } else {
            System.out.println("The value " + valueToSearch + " is not in the array.");
        }

        scanner.close();
    }
}
