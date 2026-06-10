package ch13.family.ex01;

public class Daughter extends Parent {
    String name;

    public Daughter(){
        this("자식");
    }

    public Daughter(String name) {
        super(name);
        this.name = name;
    }

    void play() {
        System.out.println(name + ": 코노에 간다.");
        doFaceMask();
    }

    private void doFaceMask() {
        System.out.println(name + ": 마스크 팩을 한다.");
    }
}
