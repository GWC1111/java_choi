package ch11.mycar.ex02;

public class Car {
    String model;
    int speed;
    int gear;

    Car() {
        System.out.println("Car() 생성자 호출됨.");
    }

    Car(String model) {
        System.out.println("Car(String name) 생성자 호출됨.");
        this.model = model;
    }

    void speedUp() {
        speed += 10;
        System.out.println("가속합니다. 현재 속도는 " + speed + "Km/h 입니다.");
    }

    void speedDown() {
        speed -= 10;
        System.out.println("감속합니다. 현재 속도는 " + speed + "Km/h 입니다.");
    }

    void gearUp() {
        gear++;
        System.out.println("기어를 1단 올려서 " + gear + "단이 되었습니다.");
    }

    void gearDown() {
        gear--;
        System.out.println("기어를 1단 내려서 " + gear + "단이 되었습니다.");
    }

    void start() {
        System.out.println(model + ": 출발합니다.");
        gearUp();
        speedUp();
    }

    void stop() {
        System.out.println("멈춥니다.");
        gear = 0;
        while(speed > 0) {
            speedDown();
        }
    }
}
