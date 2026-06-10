package ch12.mycar;

public class BusTest {
    void main() {
        Bus mycar = new Bus("람보르기니", "10-2", "마을버스"
                , new String[]{"우리집", "김포고등학교", "김포시청"}, 1300, 15);

        Bus mycar2 = new Bus("현대", "400", "시내버스"
                , new String[]{"잠실역", "롯데월드", "잠실5단지", "잠실대교"}, 1600, 40);

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();

        mycar.ride("청소년", "교통카드");
        mycar.ride("성인", "현금");
        mycar.ride("청소년", "현금");
        mycar.ride("노인", "지역주민");
        System.out.println(mycar.getBusInfo());

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();

        mycar.ride("성인", "교통카드");
        mycar.ride("어린이", "교통카드");
        mycar.ride("청소년", "교통카드");
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.ride("청소년", "교통카드");
        mycar.ride("청소년", "교통카드");

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();

        mycar.ride("성인", "교통카드");
        mycar.ride("노인", "교통카드");
        mycar.ride("노인", "교통카드");
        mycar.ride("성인", "교통카드");
        mycar.ride("청소년", "교통카드");
        mycar.ride("성인", "교통카드");
        mycar.ride("성인", "교통카드");
        mycar.ride("성인", "교통카드");
        mycar.ride("성인", "교통카드");
        mycar.ride("성인", "교통카드");
        System.out.println(mycar.getBusInfo());


        mycar2.start();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.stop();

        mycar2.ride("청소년", "교통카드");
        mycar2.ride("성인", "현금");
        mycar2.ride("청소년", "현금");
        mycar2.ride("노인", "지역주민");

        mycar2.start();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.stop();

        mycar2.ride("성인", "교통카드");
        mycar2.ride("어린이", "교통카드");
        mycar2.ride("청소년", "교통카드");
        mycar2.leave();
        mycar2.leave();
        mycar2.leave();
        mycar2.ride("청소년", "교통카드");
        mycar2.ride("청소년", "교통카드");

        System.out.println(mycar2.getBusInfo());

        System.out.println(Bus.totalBusInfo());
    }
}
