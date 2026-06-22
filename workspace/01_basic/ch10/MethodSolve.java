package ch10;

public class MethodSolve {
    void main() {
        int[] haruScore = {80, 70, 56};
        int[] namuScore = {90, 77, 80};
        int[] brongScore = {100, 99, 88};

        printScore(haruScore);
        printScore(namuScore);
        printScore(brongScore);
    }

    int sum(int[] scores) {
        int total = 0;
        for (int score : scores) total += score;
        return total;
    }

    double avg(int[] scores) {
        int total = sum(scores);
        double scoreAvg = (double)total / scores.length;
        return Math.round(scoreAvg * 10) / 10.0;
    }

    void printScore(int[] scores) {
        System.out.println("총점: " + sum(scores) + ", 평균: " + avg(scores));
    }
}
