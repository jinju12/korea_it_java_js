package ch06_condition;

import java.util.Scanner;

/*
if - else if   문 : if-else 문과 달리 else if 에는 별도의

형식:
if(조건식1){
실행문
}else if (조건식){
실행문
}else{
실행문
}
 */
public class condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = 0;
        final int vip_point = 100;
        final int gold_point = 80;
        final int silver_point = 60;
        final int Bronze_point = 40;
        System.out.print("회원 포인트를 입력");
        point = scanner.nextInt();

        if (point > 80) {
            System.out.println("회원등급: vip");
        } else if (point > 60) {
            System.out.println("회원등급: gold");
        } else if (point > 40) {
            System.out.println("회원등급: silver");
        } else if (point > 20) {
            System.out.println("회원등급: bronze");
        }



// 기능은 동일하지만 개발자 친화걱(유지보수가 용이한 형태)으로 재작성할 예정입니다.
//        1.sout이 너무많다.
         String userGrade="";
        if (point > 80) {
           userGrade="vip";
        } else if (point > 60) {
            userGrade="gold";
        } else if (point > 40) {
            userGrade="silver";
        } else if (point > 20) {
            userGrade="bronze";
        }
        System.out.println(userGrade);

        //2.요구 등급에 대한 포인트 규종이 바뀔 경우에 조건문에서 일일이 수정해야한다
        String userGrade2="";
        if (point > 100) {
            userGrade2="vip";
        } else if (point > 80) {
            userGrade2="gold";
        } else if (point > 60) {
            userGrade2="silver";
        } else if (point > 40) {
            userGrade2="bronze";
        }
        System.out.println(userGrade2);














    }
}


























