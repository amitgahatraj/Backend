package AssignmentDay2;

public class IsLeapYear {
    public static void main(String[] args) {
        isLeapYear(2000);
    }
    public static void isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year "+ year+ " is a leap year.");
        }
        else
            System.out.println("The year "+ year+ " is not a leap year.");
    }
}
