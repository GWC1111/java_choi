package ch11.capsule.ex02;

public class Score {
    private int kor;
    private int eng;
    private int math;

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public Score(int kor, int eng) {
        this.kor = kor;
        this.eng = eng;
    }

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    Score(int kor, int eng, int math) {
        if(kor > 100 || kor < 0) {
            System.out.println("kor 값은 0 ~ 100 사이로 입력해야 됩니다.");
            return;
        } else {
            this.kor = kor;
        }
        if(eng > 100 || eng < 0) {
            System.out.println("eng 값은 0 ~ 100 사이로 입력해야 됩니다.");
            return;
        } else {
            this.eng = eng;
        }
        if(math > 100 || math < 0) {
            System.out.println("math 값은 0 ~ 100 사이로 입력해야 됩니다.");
            return;
        } else {
            this.math = math;

        }


    }

    private int sum() {
        return kor + eng + math;
    }

    double avg() {
        return Math.round((sum() / 3.0) * 100) / 100.0;
    }
}
