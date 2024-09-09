//4. Java program to print sum of all even numbers between 1 to n using
//for loop.
package AssignmentDay3;
import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        sumOfEvenNumbers();
    }

    public static void sumOfEvenNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i; // Add even number to sum
        }
        System.out.println("The sum of all even numbers between 1 and " + n + " is " + sum);
        sc.close();
    }
}
