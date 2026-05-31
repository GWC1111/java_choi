package ch08;

public class ForSolve {
    public static void main(String[] args) {
        int result1 = 0, result2 = 0, result3 = 0;

        for (int i=1; i<=100; i++) {
            result1 += i;
        }

        for (int i=1; i<=100; i+=2) {
            result2 += i;
        }

        for (int i=2; i<=100; i+=2) {
            result3 += i;
        }

        System.out.println("1~100 합계: " + result1);
        System.out.println("1~100 홀수 합계: " + result2);
        System.out.println("1~100 짝수 합계: " + result3);
    }
}
