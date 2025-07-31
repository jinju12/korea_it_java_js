package ch07_loops;

public class Loop02 {
    public static void main(String[] args) {
//        1 2 3 ..10
//        11 12 ..
//        ....
//        ........100]
        int i = 0;
        int a = 0;
        while (a < 100) {
            System.out.println();
            a = a + 10;
            while (i < a) {
                ++i;
                System.out.print(i);

            }
        }
        System.out.println();



//        ----------------------------
        int k = 0;

        while (k < 100) {
            k++;
    if (k%10==0){
        System.out.print(k);
    System.out.println();

    }else {
        System.out.print(k);
    }
        }




}}
