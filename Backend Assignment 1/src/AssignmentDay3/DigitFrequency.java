//28.Java program to print the frequency of digits in given number using for
//loop.
package AssignmentDay3;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the frequency of each digit:");
        String number = scanner.nextLine();
        int[] frequency = new int[10];

        // Calculate the frequency of each digit
        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                frequency[digit - '0']++;
            }
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
        scanner.close();
    }
}
