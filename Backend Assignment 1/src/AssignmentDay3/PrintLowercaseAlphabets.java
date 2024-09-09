//32.Java program to print all lowercase alphabets using for loop.
package AssignmentDay3;

public class PrintLowercaseAlphabets {
    public static void main(String[] args) {
        System.out.println("Lowercase alphabets from 'a' to 'z':");

        // Loop through ASCII values of 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }
}


