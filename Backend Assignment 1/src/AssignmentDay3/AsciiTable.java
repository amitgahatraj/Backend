//29.Write a program in Java to print ASCII character with values using for
//loop.
package AssignmentDay3;

public class AsciiTable {
    public static void main(String[] args) {
        System.out.println("ASCII Characters and their values:");

        // Print ASCII characters for range (32 to 126)
        for (int i = 32; i <= 126; i++) {
            System.out.println("Value: " + i + " -> Character: " + (char) i);
        }
    }
}
