//18.Java program to print all Strong numbers between 1 to n using for
//loop.

package AssignmentDay3;
import java.util.Scanner;

public class StrongNumbersInRange {
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
        int n = scanner.nextInt();
        System.out.println("Strong numbers between 1 and " + n + ":");

        // Loop through all numbers from 1 to n
        for (int number = 1; number <= n; number++) {
            int originalNumber = number;
            int sum = 0;

            // Calculate the sum of factorials of digits
            for (int temp = number; temp != 0; temp /= 10) {
                int digit = temp % 10;
                sum += factorial(digit);
            }

            // Check if the sum is equal to the original number
            if (sum == originalNumber) {
                System.out.print(number + " ");
            }
        }
    }
}

