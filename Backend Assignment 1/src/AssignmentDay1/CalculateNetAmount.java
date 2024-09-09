package AssignmentDay1;

public class CalculateNetAmount {
    public static void main(String[] args) {
        calculateNetAmount();
    }
    public static void calculateNetAmount(){
        int salary = 85000;
        int TA = 15;
        int DA = 20;
        int HRA = 18;
        int PF = 20;
        int tax = 25;
        int grossAmount;
        int netAmount;

        grossAmount = ((100+TA+DA+HRA)* salary)/100;    //grossAmount is 153% of salary
        System.out.println("Gross Amount: " + grossAmount);

        netAmount = grossAmount - ((PF+tax)*salary)/100;   // netAmount = GrossAmount - (PF + tax)
        System.out.println("Net Amount: " + netAmount);
    }
}
