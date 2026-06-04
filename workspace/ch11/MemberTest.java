package ch11;

public class MemberTest {
    String id;

    MemberTest(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        MemberTest member = new MemberTest("yong");
        System.out.println("회원 아이디: " + member.id);
    }
}
