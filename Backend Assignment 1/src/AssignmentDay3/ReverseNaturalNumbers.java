//9. Java program to print all natural numbers in reverse order using for
//loop.
package AssignmentDay3;
import java.util.Scanner;
public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Natural numbers in reverse order from " + n + ":");

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}