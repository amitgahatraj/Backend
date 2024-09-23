package AssignmentDay4;

public class ThreeNumberSwapper {
    public static void main(String[] args) {
        // Sample numbers
        int a = 5;
        int b = 10;
        int c = 15;

        // Print original values
        System.out.println("Original values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Swap the numbers
        swapThreeNumbers(a, b, c);
    }

    // Method to swap three numbers using a temporary variable
    public static void swapThreeNumbers(int a, int b, int c) {
        // Use temporary variables to hold values during swapping
        int temp = a; // Step 1: Store the value of a in temp
        a = b;        // Step 2: Assign the value of b to a
        b = c;        // Step 3: Assign the value of c to b
        c = temp;     // Step 4: Assign the value of temp (original a) to c

        // Print swapped values
        System.out.println("Swapped values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

