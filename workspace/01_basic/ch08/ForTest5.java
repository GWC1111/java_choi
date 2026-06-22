package ch08;

public class ForTest5 {
    public static void main(String[] args){
//        star1();
//        star2();
//        star3();
        star4();
    }

    // *
    // **
    // ***
    // ****
    // *****
    static void star1(){
        for(int i=0; i<1; i++){
            System.out.print("*"); // *
        }
        System.out.println();

        for(int i=0; i<2; i++){
            System.out.print("*"); // **
        }
        System.out.println();

        for(int i=0; i<3; i++){
            System.out.print("*"); // ***
        }
        System.out.println();

        for(int i=0; i<4; i++){
            System.out.print("*"); // ****
        }
        System.out.println();

        for(int i=0; i<5; i++){
            System.out.print("*"); // *****
        }
        System.out.println();
    }

    // *
    // **
    // ***
    // ****
    // *****
    // ...
    // **...** 50개
    static void star2(){
        // 중첩 for문
        for(int i=0; i<5; i++) {
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *****
    // ****
    // ***
    // **
    // *
    static void star3(){
        for(int i=0; i<5; i++) {
            for (int k = 0; k < 5-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //     *
    //    **
    //   ***
    //  ****
    // *****
    static void star4(){
        for(int i=0; i<10; i++) {
            for (int k = 0; k < (10-1-i); k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}