package AssignmentDay2;

public class IsDivisibleByEleven {
    public static void main(String[] args) {
        isDivisibleByEleven(77);
    }
    public static void isDivisibleByEleven(int num){
        if (num%11==0){
            System.out.println("The number "+ num+ " is divisible by 11.");
        }
        else
            System.out.println("The number "+ num+ " is not divisible by 11.");
    }
}
