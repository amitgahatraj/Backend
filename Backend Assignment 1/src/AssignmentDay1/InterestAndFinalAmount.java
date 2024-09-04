package AssignmentDay1;

public class InterestAndFinalAmount {
    public static void main(String[] args) {
        interestAndFinalAmount();
    }

    public static void interestAndFinalAmount(){
        int principal = 500000;
        int time = 5;
        float rate = 6.8f;
        int interestAmount;
        int finalAmount;

        interestAmount = (principal*time*(int)rate)/100;
        System.out.println("Interest Amount: " + interestAmount);

        finalAmount = principal + interestAmount;
        System.out.println("Final Amount: " + finalAmount);

    }
}
