package ch09;

public class ScoreTest {
    static void main(String[] args) {
        int kor = 100; // 국어 점수
        int eng = 90; // 영어 점수
        int math = 85; // 수학 점수

        int sum = kor + eng + math;
        double avg = sum / 3.0;
//        avg = Math.round(avg);
//        avg = Math.round(avg * 10) / 10.0;
        avg = Math.round(avg * 100) / 100.0;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
