package AssignmentDay1;

public class SwapTwoNumTemp {

    public static void main(String[] args) {
        swapTwoNumTemp(1,2);
    }

    private static void swapTwoNumTemp(int a, int b){
        int temp;
        System.out.println("Before Swapping: a = " + a + " and b = " + b );
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swap using temp variable " );
        System.out.println("After Swapping: a = " + a + " and b = " + b );
        System.out.println("--------------------------------------------- ");
    }
}
