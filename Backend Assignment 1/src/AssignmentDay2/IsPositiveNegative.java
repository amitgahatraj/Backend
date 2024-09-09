package AssignmentDay2;

import java.util.Scanner;

public class IsPositiveNegative {
    public static void main(String[] args) {
        isDigitAlphSpecChar();
    }
    public static void isDigitAlphSpecChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character");
        char userInput = sc.next().charAt(0);

        if (userInput > 0) {
            System.out.println(userInput+" is positive");
        }  else {
            System.out.println(userInput+" is negative");
        }
        sc.close();
    }
}
