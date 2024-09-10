

package AssignmentDay4;

public class AverageOfArray {
    public static void main(String[] args) {
        int arr[]= {8,4,9,5,3,1,7,0,6,2};
        int sum = 0;

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " "); //print the number of elements present in an array
            sum = sum + arr[i];

        }
        System.out.println(" ");
        System.out.println("Average : " + sum/ arr.length); //print sum of elements in array
    }

}
