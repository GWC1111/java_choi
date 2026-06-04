package ch11.statictest;

public class MathUtilTest {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        double area = MathUtil.PI * 5 * 5;
        System.out.println("반지름 5인 원의 넓이는 " + area + " 입니다.");

        System.out.println("3 + 5 = " + MathUtil.add(3, 5));
    }
}
