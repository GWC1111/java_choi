package ch08;

public class WhileTest2 {
    public static void main(String[] args) {
        int month = 1;
        int sal = 1;

        while(sal < 100_000_000) {
            month++;
            sal = sal * 2;
        }

        System.out.println(month);
        System.out.println(sal);
    }
}
