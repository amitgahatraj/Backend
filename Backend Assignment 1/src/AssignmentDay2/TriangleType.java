package AssignmentDay2;
import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        triangleType();
    }

    public static void triangleType(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        int side1 = sc.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        int side2 = sc.nextInt();

        System.out.print("Enter the third side of the triangle: ");
        int side3 = sc.nextInt();

            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is an equilateral triangle.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is an isosceles triangle.");
            } else {
                System.out.println("The triangle is a scalene triangle.");
            }
        sc.close();
    }
}
