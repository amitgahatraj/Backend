package AssignmentDay2;
import java.util.Scanner;

public class IsDigit {
    public static void main(String[] args) {
        isDigit();
    }
    public static void isDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        char userInput = sc.next().charAt(0);
        if (userInput >= '0' && userInput <= '9') {
            System.out.println(userInput+" is a number");
        } else {
            System.out.println(userInput+" is not a number");
        }
        sc.close();
    }
}
