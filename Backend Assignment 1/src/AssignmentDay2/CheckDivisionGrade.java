package AssignmentDay2;

import java.util.Scanner;

public class CheckDivisionGrade {
    public static void main(String[] args) {
        checkDivisionGrade();
    }

    public static void checkDivisionGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage.");
        int percentage = sc.nextInt();

        if (percentage >= 60 && percentage <=100) {
            System.out.println("Division 1");
        } else if (percentage >= 45 && percentage <60) {
            System.out.println("Division 2");
        } else if (percentage >= 30 && percentage <45) {
            System.out.println("Division 1");
        } else if (percentage < 30) {
            System.out.println("Fail");
        }else  {
            System.out.println("Invalid Percentage");
        }
    }
}
