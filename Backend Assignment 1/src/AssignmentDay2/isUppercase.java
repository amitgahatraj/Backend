package AssignmentDay2;

import java.util.Scanner;

public class isUppercase {
    public static void main(String[] args) {
        isUppercaseOrLowercase();
    }
    public static void isUppercaseOrLowercase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char userInput = sc.next().charAt(0);

        if ((userInput >= 'A' && userInput <= 'Z') ) {
            System.out.println(userInput + " is an uppercase letter.");
        } else if (userInput >= 'a' && userInput <= 'z') {
            System.out.println(userInput + " is a lowercase letter.");
        } else {
            System.out.println(userInput+" is not an alphabet");
        }
        sc.close();
    }
}



