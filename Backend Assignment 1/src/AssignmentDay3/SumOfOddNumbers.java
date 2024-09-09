//5. Java program to print sum of all odd numbers between 1 to n using for
//loop.
package AssignmentDay3;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        sumOfOddNumbers();
    }

    public static void sumOfOddNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all odd numbers between 1 and " + n + " is " + sum);
        sc.close();
    }
}
