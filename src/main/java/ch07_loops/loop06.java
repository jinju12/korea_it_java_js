package ch07_loops;
/*
for(시작값;한계값;중감값){
반복실행문
    for(시작값;한계값;중감값){
    반복실행문
    }
    for(시작값;한계값;중감값){
    반복실행문
    }
}
 */
public class loop06 {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){

            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
            }

//        ****************************************************************************************
        int sum=5;
        for(int i=0;i<6;i++){

         for (int k=5;k-i>0;k--){
             System.out.print("*");
         }
            System.out.println();
        }
//        -******************************************************************************
for (int i=100 ; i>0;i--){
    System.out.println(i);
}

//*************************************
        for (int i=5 ; i>0;i--){

            for (int j=0 ;j>i;j++){
                System.out.print("*");
            }
            System.out.println();
        }





            }


    }

