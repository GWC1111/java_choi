package ch07;

public class IfSwitchTest {
    public static void main(String[] args) {
        int price = 20000;
        int age = 11;
        double discountRate = 0.0;
        int lastPrice = price;

        if (age >= 65) discountRate = 0.7;
        else if (age <= 19) discountRate = 0.3;
        else if (age <= 13) discountRate = 0.5;
        else if (age <= 7) discountRate = 1.0;
        else discountRate = 0;

        lastPrice = (int)(price * (1 - discountRate));

        System.out.println("나이가 " + age + "세 이므로 할인율 " + discountRate * 100 + "%가 적용되어 "
        + lastPrice + "원입니다.");
    }
}
