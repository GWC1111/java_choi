package ch11.statictest;

public class MathUtil {
    final static double PI = 3.141592;
    int r = 5;

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    void area() {
        System.out.println(PI * r * r);
    }
}
