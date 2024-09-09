package AssignmentDay2;

import java.util.Scanner;

public class IsVowelOrConsonant {
    public static void main(String[] args) {
        isVowelOrConsonant();
    }
    public static void isVowelOrConsonant(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character.");
        char userInput = sc.next().charAt(0);

        if ((userInput >= 'a' && userInput <= 'z') || (userInput >= 'A' && userInput <= 'Z')) {
            // Check if the character is a vowel
            if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u' ||
                    userInput == 'A' || userInput == 'E' || userInput == 'I' || userInput == 'O' || userInput == 'U') {
                System.out.println(userInput + " is a vowel.");
            } else {
                System.out.println(userInput + " is a consonant.");
            }
        } else {
            System.out.println(userInput + " is not a valid alphabet character.");
        }

        sc.close();
    }
}
