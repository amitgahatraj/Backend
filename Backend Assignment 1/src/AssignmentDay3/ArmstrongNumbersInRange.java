//14.Java program to print all Armstrong numbers between 1 to n using for
//loop.
package AssignmentDay3;

import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Armstrong numbers between 1 and " + n + ":");

        // Loop through all numbers from 1 to n
        for (int number = 1; number <= n; number++) {
            int originalNumber = number;
            int numDigits = 0;

            // Find the number of digits
            for (int temp = number; temp != 0; temp /= 10) {
                numDigits++;
            }

            // Calculate the sum of each digit raised to the power of numDigits
            int sum = 0;
            for (int temp = number; temp != 0; temp /= 10) {
                int digit = temp % 10;
                sum += Math.pow(digit, numDigits);
            }

            // Check if the sum is equal to the original number
            if (sum == originalNumber) {
                System.out.print(originalNumber + " ");
            }
        }
    }
}

