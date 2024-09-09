//12.Java program to find sum of all prime numbers between 1 to n using
//for loop.
package AssignmentDay3;
import java.util.Scanner;
public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int number = 2; number <= n; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += number;
            }
        }
        System.out.println("The sum of all prime numbers between 1 and " + n + " is: " + sum);
    }
}
