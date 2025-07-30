package ch06_condition;

import java.util.Scanner;

//if(조건식1){
//실행문
//}else if (조건식){
//실행문
//}else{
//실행문
//}
public class condition04  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("회원 포인트를 입s력");
        int point = scanner.nextInt();
        String userGrade="";
        if (point > 80) {
            userGrade="vip";
        } else if (point > 60) {
            userGrade="gold";
        } else if (point > 40) {
            userGrade="silver";
        } else if (point > 20) {
            userGrade="bronze";
        } else{
            userGrade="general";
        }
        System.out.println(userGrade);
/*

 */


    }
}
