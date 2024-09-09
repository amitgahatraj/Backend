//16.Java program to check all Perfect numbers between 1 to n using for
//loop
package AssignmentDay3;
import java.util.Scanner;

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Perfect numbers between 1 and " + n + ":");

        // Loop through all numbers from 1 to n
        for (int number = 1; number <= n; number++) {
            int sum = 0;

            // Find and sum all proper divisors
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            // Check if the sum of proper divisors is equal to the original number
            if (sum == number) {
                System.out.print(number + " ");
            }
        }
    }
}

