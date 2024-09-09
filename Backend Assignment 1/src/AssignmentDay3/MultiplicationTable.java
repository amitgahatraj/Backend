package AssignmentDay3;
//6. Java program to print multiplication of any number using for loop.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}
