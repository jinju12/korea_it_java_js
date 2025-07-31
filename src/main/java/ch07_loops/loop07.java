package ch07_loops;

import java.util.Scanner;

public class loop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 번호 입력");
        int score = sc.nextInt();
        int row=0;
        for(int i=0;i<score;i++){

            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<score;i++){
            for (int j=score;j-i>0;j--){
                System.out.print("*");}

        System.out.println();}













    }



}
