package TheoryClasswork;

public class Array {
    public static void main(String[] args) {
        int arr[]= {8,4,9,5,3,1,7,0,6,2};
        int sum = 0;

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " "); //print the number of elements present in an array
            sum = sum + arr[i];
        }
        System.out.println("Sum : " + sum); //print sum of elements in array
    }
}
