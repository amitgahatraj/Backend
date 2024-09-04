package AssignmentDay1;

public class SwapFourNumTemp {
    public static void main(String[] args) {
        swapFourNumTemp(1,2, 3, 4);
    }

    private static void swapFourNumTemp(int a, int b, int c, int d){
        int temp;
        System.out.println("Before Swapping: a = " + a + " and b = " + b + " and c " + c + " and d " + d );
        temp = a;
        a = b;
        b = c;
        c= d;
        d= temp;
        System.out.println("Swap using temp variable " );
        System.out.println("After Swapping: a = " + a + " and b = " + b + " and c " + c + " and d " + d);
        System.out.println("--------------------------------------------- ");
    }
}
