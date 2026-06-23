package level01.day01;

import java.util.Scanner;

public class Prob04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >=97) {
                result += (char)(str.charAt(i) - 32);
            }else{
                result += (char)(str.charAt(i) + 32);
            }
        }

        System.out.println(result);
    }
}

