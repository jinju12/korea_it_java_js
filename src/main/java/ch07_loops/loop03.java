package ch07_loops;

public class loop03 {
    public static void main(String[] args) {
//        int day =1;
//
//        while (day<6){
//            int lesson=1;
//
//            while(lesson<4){
//
//                System.out.println(day+"일차"+lesson+"교시입니다");
//                lesson ++;
//            }
//            day++;
//        }

        /*
        이상의 코드를 활요하여
        2x1=2
        ...
        9x9=81
         */
   int i =2;

   while(i<10){

       int j=1;
       while(j<10){
           System.out.println(i+"X"+j+"="+(i*j));
           j++;
       }
       i++;
   }


    }
}
