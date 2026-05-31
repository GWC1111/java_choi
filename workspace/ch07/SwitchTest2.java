package ch07;

public class SwitchTest2 {
    public static void main(String[] args) {
        int price = 10000; // 정상가
        char grade = 'C'; // 회원 등급
        int discountRate = 0; // 할인율(%)
        int lastPrice = price; // 할인가


        if (grade == 'A') {
            discountRate = 50;
        } else if (grade == 'B') {
            discountRate = 30;
        } else if (grade == 'C') {
            discountRate = 10;
        } else if (grade == 'D') {
            discountRate = 0;
        }


        switch (grade) {
            case 'A': // grade == 'A'
                discountRate = 50;
                break;
            case 'B': // grade == 'B'
                discountRate = 30;
                break;
            case 'C': // grade == 'C'
                discountRate = 10;
                break;
            case 'D': // grade == 'D'
                discountRate = 0;
                break;
        }

        lastPrice = (int) (price * (1 - discountRate / 100.0));

        System.out.println("회원님은 " + grade + "등급이므로 정상가 " + price + "원에서 "
                + discountRate + "% 할인된 가격 " + lastPrice + "원 입니다.");
    }
}