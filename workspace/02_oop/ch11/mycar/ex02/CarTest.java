package ch11.mycar.ex02;

public class CarTest {
    public static void main(String[] args) {
//        Car mycar = new Car();
//        mycar.model = "BMW";

        Car mycar = new Car("람보르기니");
        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();

        mycar.stop();
    }
}
