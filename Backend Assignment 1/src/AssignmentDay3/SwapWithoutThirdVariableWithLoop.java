//21.Java program to swap values without using third variable using for
//        loop.
package AssignmentDay3;
import java.util.Scanner;

public class SwapWithoutThirdVariableWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        for (int i = 0; i < 1; i++) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println("Swapped values: a = " + a + ", b = " + b);
    }
}
