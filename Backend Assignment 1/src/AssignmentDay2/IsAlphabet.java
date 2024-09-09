package AssignmentDay2;

import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
        isAlphabet();
    }
    public static void isAlphabet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char userInput = sc.next().charAt(0);
        if ((userInput >= 'A' && userInput <= 'Z') || userInput >= 'a' && userInput <= 'z') {
            System.out.println(userInput+" is an alphabet");
        } else {
            System.out.println(userInput+" is not an alphabet");
        }
        sc.close();
    }
}
