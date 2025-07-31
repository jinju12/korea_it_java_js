package ch07_loops;

import java.util.Scanner;

public class loop05 {
    public static void main(String[] args) {

//        for (int i=1;i<6;i++){
//            for (int j=1;j<4;j++){
//                System.out.println(i+"일차"+j+"교시입니다.");
//            }
//        }
//
//    for (int i=2;i<10;i++){
//        for(int k=1;k<10;k++){
//            System.out.println(i+"X"+k+"="+i*k);
//
//        }
//    }

/*
12345...10
11....20
91...100
 */
        int num = 1;
        for(int i=1;i<11;i++){
            for (int j = 1; j < 11; j++) {

                System.out.print(num++);
            }

            System.out.println();
        }
//***************************************************************************************
for (int i=1;i<101;i++){
    if (i%10==0){
        System.out.print(i+"");
        System.out.println();

    }else {
        System.out.print(i);
    }
}
//?****************************************************************************
        for (int i=1;i<101;i+=10){
            System.out.println(i+""+(i+1)+""+(i+2)+""+(i+3)+""+(i+4)+""+(i+5)+""+(i+6)+""+(i+7)+""+(i+8)+""+(i+9));
        }
//        *************************************************
        Scanner sc= new Scanner(System.in);
        System.out.println("더할숫자 입력");
        int number= sc.nextInt();
        int sum=0;
        for (int i=1;i<number+1;i++){
           sum+=i;
    }System.out.println(sum);

//****************************************************************************************
        int sum1=0;
        for (int i=0;i<number+1;i+=2){
            System.out.println(i);
            sum1+=i;
        }System.out.println(sum1);
//*************************************************************************************
        int sum2=0;
        int even3=0;
        int odd4=0;
        for (int i=0;i<number+1;i++) {
            sum2 += i;
            if (sum2 % 2 == 0) {
                even3 += i;
            } else {
                odd4 += i;
            }
        }
        System.out.println(""+sum2+even3+odd4);
//************************************************************************************





























    }

}