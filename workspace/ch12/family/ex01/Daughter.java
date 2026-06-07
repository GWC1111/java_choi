package ch12.family.ex01;

public class Daughter {
    String name;

    public Daughter(){
        this("자식");
    }

    public Daughter(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + ": 음식을 맛있게 먹는다.");
    }

    void play() {
        System.out.println(name + ": 코노에 간다.");
    }

    void sleep() {
        System.out.println(name + ": 꿀잠을 잔다.");
    }
}
