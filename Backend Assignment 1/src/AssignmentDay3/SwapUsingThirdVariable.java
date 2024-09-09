//20.Java program to swap values using third variable using for loop.
package AssignmentDay3;
import java.util.Scanner;

public class SwapUsingThirdVariable  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int temp = a;
        for (int i = 0; i < 1; i++) {
            a = b;
            b = temp;
        }
        System.out.println("Swapped values: a = " + a + ", b = " + b);
    }
}

