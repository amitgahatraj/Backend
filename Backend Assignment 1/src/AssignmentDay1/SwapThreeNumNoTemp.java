package AssignmentDay1;

public class SwapThreeNumNoTemp {
    public static void main(String[] args) {
        swapThreeNumNoTemp(3, 4, 5);
    }

    private static void swapThreeNumNoTemp(int a, int b, int c){
        int temp;
        System.out.println("Before Swapping: a = " + a + " and b = " + b + " and c = " + c  );
        c = a + b + c;
        b = c - (b + a);
        a = c - (b + a);
        c = c - (b + a);

        System.out.println("Swap without using temp variable " );
        System.out.println("After Swapping: a = " + a + " and b = " + b+ " and c = " + c   );
        System.out.println("--------------------------------------------- ");
    }
}
