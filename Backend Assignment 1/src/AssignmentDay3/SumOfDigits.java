//8. Java program to print the sum of digits of a given number using for
//loop.
package AssignmentDay3;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            sum += temp % 10;  // Add the last digit to sum
        }
        System.out.println("The sum of digits of " + number + " is: " + sum);
    }
}
