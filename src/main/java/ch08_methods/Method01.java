package ch08_methods;

import java.util.Scanner;

public class Method01 {
    public static void Call1(){
        System.out.println("[x]");

    }

//    2.[0|X]
public static void Call2(String example) {
    System.out.println("[0|X]");
    System.out.println(example);
}
// 3.[x|0]
    public static String Call3(){
        String example ="안녕하세요";
        System.out.println("[x|0]");
        return  example;
    }
    public static int call3And1(){
        System.out.println("[x|0]");
        return  1;
    }
//4.[0|0]
    public static double call4(double score){
        System.out.println("[0;0]");
        return score*3;
    }
/*
return 이 있는 이유는 기본적으로 데이터의 조작을 위해서입니다. 그리고 특정 메서드의 결과값이
다른 메서드의 argument 로 사용될 수도 있습니다

함수형 프로그래밍 (Functional Programming):"

 */
public static String introduce (String name,int age){
    return "제이름은"+ name+"이고,나이는"+age+"살입니다";
}

    public static void main(String[] args) {
//        Call1();
//        Call1();
//        Call1();
//        Call1();
//        Call2("a");
//        System.out.println(Call3());
//        System.out.println(call3And1());
//
//        String name="김일";
//        System.out.println(name+"학생의 학점은"+call4(4.5)+"점입니다.");
//        System.out.println(call4(4.5));

        Scanner scanner=new Scanner(System.in);
        String myName="";
        int myAge=0;
        System.out.println("이름을 입력해주세여");
        myName=scanner.nextLine();
        System.out.println("나이를 입력하세요");
        myAge= scanner.nextInt();
        System.out.println(introduce(myName,myAge));











    }

















}
