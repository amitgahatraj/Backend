package AssignmentDay1;

public class DominosFinalAmount {
    public static void main(String[] args) {
        dominosFinalAmount();
    }

    public static void dominosFinalAmount(){
        double pizzaCost = 399.0;
        int discountPercentage = 20;
        double finalBillAmount ;

        finalBillAmount = (2 * pizzaCost) - ((discountPercentage* 2 * pizzaCost)/100);
        System.out.println("Final Bill Amount " + finalBillAmount);
    }
}
