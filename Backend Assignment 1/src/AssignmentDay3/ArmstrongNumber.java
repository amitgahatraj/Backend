//13.Java program to check a given number is Armstrong or not using for
//loop.
package AssignmentDay3;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        // Find the number of digits
        int numDigits = 0;
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
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}

