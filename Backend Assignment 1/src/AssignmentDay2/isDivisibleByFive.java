package AssignmentDay2;

public class isDivisibleByFive {
    public static void main(String[] args) {
        IsDivisibleByFive(5);
    }
    public static void IsDivisibleByFive(int num){
        if (num%5==0){
            System.out.println("The number "+ num+ " is divisible by 5.");
        }
        else
            System.out.println("The number "+ num+ " is not divisible by 5.");
    }
}
