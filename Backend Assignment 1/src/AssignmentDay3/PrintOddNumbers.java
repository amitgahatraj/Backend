//3. Java program to print all odd number between 1 to 100 using for loop.
package AssignmentDay3;

public class PrintOddNumbers {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers(){
        for (int i =1; i<=100; i+=2){
            System.out.println(i);
        }
    }
}
