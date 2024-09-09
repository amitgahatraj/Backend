package AssignmentDay2;

public class MaxOfTwoNum {
    public static void main(String[] args) {
        maxOfTwoNum(3,4);
    }
    public static void maxOfTwoNum(int a, int b){
        if (a>b){
            System.out.println("a : " + a + " is greater than b " + b);
        }
        else if (b > a){
            System.out.println("b : " + b + " is greater than a " + a);
        }
        else
            System.out.println("a is equal to b");
    }
}
