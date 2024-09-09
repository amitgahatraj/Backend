//17.Java program to check a given number is Strong number or not using
//for loop.
package AssignmentDay3;
import java.util.Scanner;

public class StrongNumber {
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of factorials of digits
        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10;
            sum += factorial(digit);
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
    }
}

