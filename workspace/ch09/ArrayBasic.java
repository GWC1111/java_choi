package ch09;

public class ArrayBasic {
    static void main(String[] args) {
        int[] scores = new int[3];
        String[] names = new String[5];

        scores[0] = 80; scores[1] = 90; scores[2] = 85;
        names[0] = "철수"; names[1] = "짱구"; names[2] = "훈이"; names[3] = "맹구"; names[4] = "길동";

        System.out.println(scores[1]);

        for (int i=0; i<names.length; i++) System.out.print(names[i] + "\t");
    }
}
