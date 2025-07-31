package ch07_loops;

import java.util.Scanner;

/*
* 형식
* for (시작값;종료값;중감값){
* 반복 실행문
* }
* */
public class loop04 {
    public static void main(String[] args) {
//        for(int i=1; i<101;i++){
//            System.out.println(i);
//        }
//        1부터100까지 합을 구하고 한번만 출려ㄱ하시오
//        int sum=0;
//        for (int i=1;i<101;i++){
//           sum=sum+i;
//        }
//        System.out.println(sum);
//        1부터 100까지 중 홀수 합을 구하는  for믄을 작성하지오
//        그러니까 for 내부에 if문을 중첩적읋 쓸수 있다는 의미겠네요.
//        그리고 증감값 건드려서 다른 방식으로도 풀 수 있겠습니다
//        int sum2=0;
//        for (int i=0; i<101;i++){
//            if (i%2!=0){
//            sum2=sum2+i ;
//            }
//        }
//        int sum3=0;
//        System.out.println(sum2);
//        for (int i=0; i<101;i+=2){
//            sum3=sum3+i;
//
//        }
//        System.out.println(sum3);
        int sum4=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1부터 몇까지 더하시겠습니까?");
        int i= scanner.nextInt();
        for (int k=1; k<i+1;k++){
sum4=sum4+k;
   }
        System.out.println(sum4);


        System.out.println("1부터"+i+"까지의 합은"+((i*(i+1))/2));




    }
}
