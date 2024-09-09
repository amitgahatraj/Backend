
//21. Java Program to Calculate percentage and grade of students on the basis of marks obtained
//in 5 subjects Maths, Physics, Chemistry, English and Hindi. Marks of subject is taken as an input:
//Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C, Percentage
//>= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F

package AssignmentDay2;

import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        checkDivision();
    }

    private static void checkDivision() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the students roll number");
        int roll = sc.nextInt();
        double maths = 0;
        double nepali = 0;
        double science = 0;
        boolean mathsAdded = false;
        boolean scienceAdded = false;
        boolean nepaliAdded = false;
        boolean nextVal = true;
        int totalMarks = 300;

        while(nextVal) {
            String menu = "Enter the marks obtained by the student for \n Maths(M), Science(S), Nepali(N) \n" +
                    "Use M for maths , S for science & N for nepali";
            System.out.println(menu);
            char userInput = sc.next().charAt(0);
            userInput = Character.toLowerCase(userInput);
            switch (userInput) {
                case 'm':
                    System.out.println("Enter the marks obtained by the student in Maths");
                    if (mathsAdded) {
                        System.out.println("Marks already added for Maths! Do you want to re enter it ? \n Type y for yes and n for no.");
                        char updateMathScore = sc.next().charAt(0);
                        if (Character.toLowerCase(updateMathScore) == 'y') {
                            System.out.println("Please re enter the marks");
                            maths = sc.nextDouble();
                        }
                    } else {
                        maths = sc.nextDouble();
                    }
                    mathsAdded = true;
                    break;
                case 'n':
                    System.out.println("Enter the marks obtained by the student in Nepali");
                    if (nepaliAdded) {
                        System.out.println("Marks already added for Nepali! Do you want to re enter it ? \n Type y for yes and n for no.");
                        char updateNepaliScore = sc.next().charAt(0);
                        if (Character.toLowerCase(updateNepaliScore) == 'y') {
                            System.out.println("Please re enter the marks");
                            nepali = sc.nextDouble();
                        }
                    } else {
                        nepali = sc.nextDouble();
                    }
                    nepaliAdded = true;
                    break;
                case 's':
                    System.out.println("Enter the marks obtained by the student in Science");
                    if (scienceAdded) {
                        System.out.println("Marks already added for Science! Do you want to re enter it ? \n Type y for yes and n for no.");
                        char updateScienceScore = sc.next().charAt(0);
                        if (Character.toLowerCase(updateScienceScore) == 'y') {
                            System.out.println("Please re enter the marks");
                            science = sc.nextDouble();
                        }
                    } else {
                        science = sc.nextDouble();
                    }
                    scienceAdded = true;
                    break;
                default:
                    System.out.println("Invalid option selected. Please enter valid response!");
                    break;
            }
            if (((mathsAdded == true) && (scienceAdded == true) && (nepaliAdded == true))) {
                nextVal = false;
            }
        }

        System.out.println("*" . repeat(50));
        System.out.println("*". repeat(15) + "Marksheet of "+ roll + "*".repeat(15));
        System.out.println("Marks in Maths: \t" + maths);
        System.out.println("Marks in Science: \t" + science);
        System.out.println("Marks in Nepali: \t" + nepali);
        System.out.println("*" . repeat(50));
        double obtainedPercent = ((maths+science+nepali) * 100)/totalMarks;
        System.out.println(obtainedPercent);
        if (obtainedPercent >= 60 && obtainedPercent <= 100) {
            System.out.println("First Division!");
        } else if (obtainedPercent >= 45 && obtainedPercent <= 59) {
            System.out.println("Second Division!");
        } else if (obtainedPercent >= 30 && obtainedPercent <= 44) {
            System.out.println("Third Division!");
        } else {
            System.out.println("Failed!!!");
        }
        System.out.println("*" . repeat(40));
        sc.close();
    }
}
