package ch06_condition;

// 형식
// if(조건식){
//
//{

import java.util.Scanner;

public class condition01 {
    public static void main(String[] args) {
        int num1=10;
        if (num1>0){
            System.out.println("num1은 양수입니다");
        }
        if(num1>15){
            System.out.println("num1은 15초과");
        }


//        scanner import
        Scanner scanner= new Scanner(System.in);
        System.out.print("숫자 입력");
        int num2 = scanner.nextInt();
        if (num2>0){
            System.out.print("num2가 양수입니다");
        }
    }
}
