package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        // 1 @1upcastung :  더 큰 용량의 자료효ㅕㅇ으로 변환시키는 것
        // 변수 선언 및 초기화

        // 잜횽 뵨슈묭 -값:
        char cast1='A';
        System.out.println("원형 :"+ cast1);
        //# 업캐스팅 방법 #1
        //형변환을 하기 위해서는 '(바꿀데이터타입)변수명' 으로 작성하시면됩니다
        System.out.println("변형:"+(int)cast1); // A fmf int로 형 변환 시 65\
        char cast2='a';
        System.out.println("원형 :"+ cast2);
        System.out.println("변형:"+(int)cast2);//a는 97 *외우세요
        //업캐스팅 벙법 #2
        // 새로운 변수를 선언하여 캐스티이 이루어진 데이터를 집어넣는 방법입니다
        char cast3='b';
        int casted3 =cast3 ;

        System.out.println("원형 :"+ cast3);
        System.out.println("변형:"+casted3);//a는 97 *외우세요

        // 다운캐스팅 : 용량이 더 적은 자료형으로 변형하는 것을 의미
        int cast4=99; // 얘는 #1으로.
        int cast5=100;// 예는 #2로
//        지시 시힝 : 디은케스팅하는 방법을 업캐스팅 방법 #1,2를 참조하여  char 형으로 바꾼 후
        // 콘솔창에 원형과 변형을 모두 출력하시오

        //다운캐스팅 방법#1
        System.out.println((char)cast4);
        System.out.println((char)cast5);
        //다운캐스팅 방법#2
//        **char casted5=cast5;* 사용불가
//        다운캐스팅시  명시적 explicit 사용해야함

        char casted5=(char)cast5;
        System.out.println("원형 :" + cast5);
        System.out.println("변형 :" + casted5);

        // int 가 21억 정도까지의 범위인데 더 큰 숫자로 표기하기 위해서는
//          정수 기준으로 long ->SQL 문에서는 그 와중에  long이 아니라 bigint라고 씁니다.
//         ch06_condition ->Condition01 ->main

    }
}

