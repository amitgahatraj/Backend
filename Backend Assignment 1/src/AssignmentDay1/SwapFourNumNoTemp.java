package AssignmentDay1;

public class SwapFourNumNoTemp {
    public static void main(String[] args) {
        swapFourNumNoTemp(3, 4, 5, 6);
    }

    private static void swapFourNumNoTemp(int a, int b, int c, int d){
        int temp;
        System.out.println("Before Swapping: a = " + a + " and b = " + b + " and c = " + c + " and d = " + d  );
        d = a + b + c+ d;
        c = d - (a+b+c);
        b = d - (a+b+c);
        a = d - (a+b+c);
        d = d - (a+b+c);


        System.out.println("Swap without using temp variable " );
        System.out.println("After Swapping: a = " + a + " and b = " + b+ " and c = " + c + " and d = " + d   );
        System.out.println("--------------------------------------------- ");
    }
}
