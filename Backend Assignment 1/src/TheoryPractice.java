public class TheoryPractice {
    public static void main(String[] args) {
        //Question3();
        Question4();

    }

//    public static void Question3(){
//        int a = 0;
//        for(int i = 0; i <10;i++){
//            for(int j = 1; j <=5;j++){
//                System.out.print((a+=2) + " ");
//
//            }
//            System.out.println();
//        }
//    }

    public static void Question4(){
        int row = 5;

        for(int i = row-1; i>0;i--){
            for( int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
