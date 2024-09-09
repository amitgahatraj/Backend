package AssignmentDay2;

import java.util.Scanner;

public class IsDigitAlphSpecChar {
    public static void main(String[] args) {
        isDigitAlphSpecChar();
    }
    public static void isDigitAlphSpecChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character");
        char userInput = sc.next().charAt(0);

        if (Character.isDigit(userInput)) {
            System.out.println(userInput+" is a digit");
        } else if (Character.isLetter(userInput)) {
            System.out.println(userInput+" is an alphabet");
        } else {
            System.out.println(userInput+" is a special Character");
        }
        sc.close();
    }
}
