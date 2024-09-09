//33.Java program to print all factors of a number using for loop.
package AssignmentDay3;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its factors:");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + ":");

        // Loop through numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
