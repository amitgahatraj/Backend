package AssignmentDay1;

public class SwapThreeNumTemp {
    public static void main(String[] args) {
        swapThreeNumTemp(1,2, 3);
    }

    private static void swapThreeNumTemp(int a, int b, int c){
        int temp;
        System.out.println("Before Swapping: a = " + a + " and b = " + b + " and c " + c );
        temp = a;
        a = b;
        b = c;
        c= temp;
        System.out.println("Swap using temp variable " );
        System.out.println("After Swapping: a = " + a + " and b = " + b + " and c " + c);
        System.out.println("--------------------------------------------- ");
    }
}
