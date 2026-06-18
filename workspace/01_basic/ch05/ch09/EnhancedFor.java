package ch09;

public class EnhancedFor {
    public static void main(String[] args) {
//        int[] scores = {90, 80, 75};
        int[] scores = {100, 80, 70, 88};

        int sum = 0;
        double avg = 0;

        for (int score : scores) {
            sum += score;
        }

        avg = (double)sum / scores.length;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
