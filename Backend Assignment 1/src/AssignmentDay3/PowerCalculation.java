//22.Java program to calculate power of a number without using pow
//method using for loop.
package AssignmentDay3;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        if (exponent < 0) {
            System.out.println("Exponent should be a non-negative integer.");
            return;
        }

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}

