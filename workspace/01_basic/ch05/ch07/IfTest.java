package ch07;

public class IfTest {
    public static void main(String[] args) {
        int num = 15;

        if (num % 3 == 0) {
            System.out.println(num + ": 3의 배수입니다.");
        }

        if (num % 3 != 0) {
            System.out.println(num + ": 3의 배수가 아닙니다.");
        }
    }
}
