//7. Java program to count the digits of a given number using for loop.
package AssignmentDay3;
import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            count++;
        }
        System.out.println("The number of digits in " + number + " is: " + count);
    }
}
