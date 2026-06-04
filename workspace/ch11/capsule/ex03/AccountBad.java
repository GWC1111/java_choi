package ch11.capsule.ex03;

public class AccountBad {
    public int balance;

    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금 되었습니다. 잔고는 " + balance + "원 입니다.");
        } else {
            System.out.println("입금액이 잘못 되었습니다.");
        }
    }

    public void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금 되었습니다. 잔고는 " + balance + "원 입니다.");
        } else {
            System.out.println("잔고가 부족합니다. 잔고는 " + balance + "원 입니다.");
        }
    }
}
