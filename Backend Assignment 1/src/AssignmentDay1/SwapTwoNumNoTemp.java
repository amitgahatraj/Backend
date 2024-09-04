package AssignmentDay1;

public class SwapTwoNumNoTemp {
    public static void main(String[] args) {
        swapTwoNumNoTemp(3,4);
    }

    private static void swapTwoNumNoTemp(int a, int b){
        int temp;
        System.out.println("Before Swapping: a = " + a + " and b = " + b );
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swap without using temp variable " );
        System.out.println("After Swapping: a = " + a + " and b = " + b );
        System.out.println("--------------------------------------------- ");
    }
}
