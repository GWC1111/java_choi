package ch07;

public class IfTest2 {
    public static void main(String[] args) {
        int month = 5;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(month + "월의 마지막 날은 31일입니다.");
        } else if (month == 2) {
            System.out.println("2월의 마지막 날은 28일입니다.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(month + "월의 마지막 날은 30일입니다.");
        }
    }
}
