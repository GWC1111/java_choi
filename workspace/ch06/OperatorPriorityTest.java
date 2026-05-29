package ch06;

public class OperatorPriorityTest {
    public static void main(String[] args) {
        int result1 = 5 + 3 * 2;
        System.out.println("result1 (5 + 3 * 2) = " + result1);

        int result2 = (5 + 3) * 2;
        System.out.println("result1 ((5 + 3) * 2) = " + result2);

        boolean result3 = 10 > 5 && 3 < 1;
        System.out.println("result3 (10 > 5 && 3 < 1 = " + result3);
    }
}
