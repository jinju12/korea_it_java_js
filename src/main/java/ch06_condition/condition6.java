package ch06_condition;

import java.util.Scanner;

/*
고민해봐야 할 사항
100 초과/0미만의 점수가 입력됐을 때 각각 A / F 라는 결과값이 나오게됩니다.
애초에 잘못된 점수를 입력했을 때 불가능 한 점수 입력이라고 안내를 하려면 어떻게
할 수 있을까요?
100 초괴/0 미만의 경우  grade 를 X 라고 하겠습니다
 */
public class condition6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("회원 포인트를 입력");
        int score = scanner.nextInt();
        String grade = "";

        if (score > 100||score <0) {
            grade = "X";
        }else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 50) {
            grade = "E";
        }
//         논리연산자

        System.out.println(grade);
    }
}
