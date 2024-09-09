package AssignmentDay1;

public class TaxAmount {
    public static void main(String[] args) {
        taxAmount();
    }

    public static void taxAmount(){
        int salary = 85000;
        int taxPercentage = 20;
        int taxAmount;

        taxAmount = (taxPercentage*salary)/100;
        System.out.println("Tax Amount: " + taxAmount);
    }
}
