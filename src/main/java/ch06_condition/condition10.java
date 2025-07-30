package ch06_condition;

import java.util.Scanner;

/*
삼항 연산자
 정의 : 조건식을 평가하여 true/false 에 따라 두가지 표현식 중 하나를 선택적으로 실행
 형식 :
 조건식 ?표현식1:표현식2;
 조건식:true/false 로 평가 가능한 식
 표현식1 : 조건식이 True일때 실행되는 식
 표현식2 : 조건식이 false이 때 실행되는 식

 */
public class condition10 {
    public static void main(String[] args) {
//        int a=5;
//        int b=3;
//        int max;
////        a>b라면 max에 a를 대입 / 아니라면 max에 b를 대입
//        max=(a>b)?a:b;
//        System.out.println("max"+max);


        Scanner scanner=new Scanner(System.in);
        System.out.println("연도를 입력학세요");
        int year= scanner.nextInt();
//        boolean isLeapYear = ((year%4==0&&year%100!=0)||(year%400==0));
//
//        String result =isLeapYear?"유년입니다":"유년이 아닙니다";
//        System.out.println(result);
        boolean isLeapYea2r = ((year%4==0&&year%100!=0)||(year%400==0));
        String result2="";
        if (year<0){
            result2="불가능한 연도입력입니다";
        }else {
            result2 =isLeapYea2r?"유년입니다":"유년이 아닙니다";
        }System.out.println(result2);


        String result3 =year<0?" 불가능한 연도 입력입니다"
                :((year%4==0 && year%100!=0)||(year%400==0))? "유년입니다" :"유년이 아닙니다";
        System.out.println(year+"년은"+result3);
    }
}
