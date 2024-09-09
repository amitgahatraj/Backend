package AssignmentDay2;

public class IsDivisibleByThree {
    public static void main(String[] args) {
        isDivisibleByThree(5);
    }
    public static void isDivisibleByThree(int num){
        if (num%3==0){
            System.out.println("The number "+ num+ " is divisible by 3.");
        }
        else
            System.out.println("The number "+ num+ " is not divisible by 3.");
    }
}
