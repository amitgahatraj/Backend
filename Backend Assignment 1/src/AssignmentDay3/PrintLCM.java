//35.Java program to print LCM of two numbers using for loop.
package AssignmentDay3;

import java.util.Scanner;

public class PrintLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        scanner.close();
    }

    public static int findLCM(int num1, int num2) {
        // Find the maximum of the two numbers to start the search for LCM
        int max = Math.max(num1, num2);

        // Loop to find the LCM
        for (int i = max; ; i += max) {
            if (i % num1 == 0 && i % num2 == 0) {
                return i;
            }
        }
    }
}

