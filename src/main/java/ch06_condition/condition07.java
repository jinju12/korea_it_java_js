package ch06_condition;

import java.util.Scanner;

// 중첩 if문(Nested-if)
/*
if문 내에 if문이 중첩적으로 사용될수 있습니다
else if

if(조건1a){
if(조건1aa){
if(조건1aa){
    else if(조건 1aa){

    }

}
}
}
* */
public class condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("회원 포인트를 입력");
        int score = scanner.nextInt();
        String grade = "";

        if (score > 100||score <0) {
            grade = "불가능한 점수 입력입니다 X";
        }else{
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else if (score < 50) {
                grade = "F";
            }
        }
        System.out.println(grade);







    }
}
