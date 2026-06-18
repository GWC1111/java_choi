package ch11.statictest;

public class MainMethodTest {

    public void instanceMethod() {
        System.out.println("인스턴스 메서드 호출.");
    }

    public static void staticMethod() {
        System.out.println("static  메서드 호출.");
    }

    public static void main(String[] args) {
        staticMethod();

        MainMethodTest m = new MainMethodTest();
        m.instanceMethod();
    }
}
