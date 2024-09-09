package AssignmentDay2;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        isEvenOrOdd(5);
    }
    public static void isEvenOrOdd(int num){
        if (num % 2 == 0){
            System.out.println("The number "+ num+ " is even.");
        }
        else
            System.out.println("The number "+ num+ " is odd.");
    }
}
