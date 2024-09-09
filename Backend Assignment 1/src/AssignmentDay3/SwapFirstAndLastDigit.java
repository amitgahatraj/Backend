//19.Write a program in Java to swap first and last digit of number using for
//loop.
package AssignmentDay3;
import java.util.Scanner;

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);

        if (numberStr.length() == 1) {
            System.out.println("The number has only one digit. No swap needed.");
            return;
        }

        // Extract first and last digits
        char firstDigit = numberStr.charAt(0);
        char lastDigit = numberStr.charAt(numberStr.length() - 1);

        // Form the new number with swapped first and last digits
        StringBuilder swappedNumberStr = new StringBuilder();
        swappedNumberStr.append(lastDigit);
        swappedNumberStr.append(numberStr, 1, numberStr.length() - 1);
        swappedNumberStr.append(firstDigit);

        // Convert the result back to an integer
        int swappedNumber = Integer.parseInt(swappedNumberStr.toString());

        // Print the result
        System.out.println("Number with first and last digits swapped: " + swappedNumber);
    }
}
