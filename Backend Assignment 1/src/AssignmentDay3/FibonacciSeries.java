//26.Java program to print Fibonacci series of a given number using for
//loop.
package AssignmentDay3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFibonacci(terms);
        }

        scanner.close();
    }

    public static void printFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
