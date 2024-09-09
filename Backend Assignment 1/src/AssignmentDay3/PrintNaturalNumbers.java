//1. Java program to print all natural numbers from 1 to n using for loop.

package AssignmentDay3;

import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        printNaturalNumbers();
    }

    public static void printNaturalNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number.");
        int n = sc.nextInt();
        System.out.println("All natural numbers from 1 to "+ n + " is given below using for loop.");
        for (int i =1; i<=n; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
