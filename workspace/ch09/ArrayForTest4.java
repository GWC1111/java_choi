package ch09;

import java.util.Scanner;

// 구구단 출력
public class ArrayForTest4 {
    public static void main(String[] args){
        int[] result = new int[9];
        System.out.println("학습할 단을 입력하세요.");
        Scanner s = new Scanner(System.in); // 사용자가 입력한 데이터를 받을때 사용
        int dan = s.nextInt(); // 입력한 값을 int로 꺼내옴
        System.out.println("입력한 값: " + dan);

        for (int i=0; i<9; i++) {
            result[i] = dan * (i+1);
        }

        System.out.println("학습 완료");

        int i = 0;
        while (true){
            System.out.println("곱할 숫자를 입력하세요. 0을 입력하면 종료됩니다.");
            i = s.nextInt();

            if (i==0 || i > 9) break;

            System.out.println(dan + " x " + i + " = " + (result[i-1]));
        }

        System.out.println("프로그램을 종료합니다.");
    }
}