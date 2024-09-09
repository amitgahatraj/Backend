package AssignmentDay2;

public class MaxOfThreeNum {
    public static void main(String[] args) {
        maxOfThreeNum(3,4, 5);
    }
    public static void maxOfThreeNum(int a, int b,int c){
        if (a>b && a>c){
            System.out.println("a: " + a + " is greater than b: " + b + " and  c: " + c);
        }
        else if (b > a && b > c){
            System.out.println("b : " + b + " is greater than a: " + a + " and  c: " + c);
        }
        else if (c> a && c > b){
            System.out.println("c: " + c + " is greater than a: " + a + " and  b: " + b);
        }
    }

}
