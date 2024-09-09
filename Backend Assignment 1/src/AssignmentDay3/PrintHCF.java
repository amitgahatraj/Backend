//34.Java program to print HCF (GCD) of two numbers using for loop.
package AssignmentDay3;

import java.util.Scanner;

public class PrintHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);
        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + hcf);
        scanner.close();
    }

    public static int findHCF(int num1, int num2) {
        int min = Math.min(num1, num2);
        int hcf = 1;

        // Loop through all numbers from 1 to the minimum of num1 and num2
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }
}
