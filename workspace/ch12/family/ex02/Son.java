package ch12.family.ex02;

public class Son extends Parent {
    String name;

    public Son(){
        this("자식");
    }

    public Son(String name) {
        super(name);
        this.name = name;
    }

    void play() {
        work();
        System.out.println(name + ": 게임을 한다.");
    }

    private void work() {
        System.out.println(name + ": 일한다.");
    }
}
