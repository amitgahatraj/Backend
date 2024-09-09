package AssignmentDay1;

public class CalculateFinalPlanCost {
    public static void main(String[] args){
        calculateFinalPlanCost();
    }

    public static void calculateFinalPlanCost(){
        int silverPlanCost = 699;
        int gst = 18;
        int finalCost;

        finalCost = silverPlanCost + ((gst * silverPlanCost)/100);
        System.out.println("Final Cost: " + finalCost);
    }
}
