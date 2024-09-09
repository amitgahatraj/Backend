//11.Java program to print all Prime numbers between 1 to n using for loop.
package AssignmentDay3;
import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers between 1 and " + n + ":");

        for (int number = 2; number <= n; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}