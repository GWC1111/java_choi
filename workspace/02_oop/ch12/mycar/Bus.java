package ch12.mycar;

public class Bus extends Car {
    private int passengerCount; // 승객 수
    private String no; // 버스 번호
    private String type; // 광역버스, 마을버스 ...
    private String[] stations; // 노선
    private int station; // 현재 위치
    private int price; // 승차비
    private int maxPassenger; // 최대 승객수
    private int money; // 현재까지의 수익
    static int totalPassenger = 0; // 총 승차 인원
    static int totalMoney = 0; // 운영하는 모든 버스의 수익
    static int busCount;

    public Bus(String model, String no, String type, String[] stations, int price, int maxPassenger) {
        super(model);
        this.no = no;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.maxPassenger = maxPassenger;
        busCount++;
    }

    void ride(String person, String payment) {
        System.out.println("-------------------------------");
        // 수익 증가
        // 어린이 / 청소년 / 성인 / 노인별 할인율 적용해서 할인
        // 교통카드 / 현금 / 기타 할인 (지역 주민 할인, 특정 카드 이용시 할인)
        int rate = 0;
        int charge = 0;
        if(passengerCount < maxPassenger) {
            passengerCount++;
            if(person.equals("성인")) {
                rate = 100;
                System.out.println(person + " 1명이 승차합니다.");
            } else if(person.equals("청소년")) {
                rate = 80;
                System.out.println(person + " 1명이 승차합니다.");
            } else if(person.equals("노인")) {
                rate = 50;
                System.out.println(person + " 1명이 승차합니다.");
            } else if(person.equals("어린이")) {
                rate = 50;
                System.out.println(person + " 1명이 승차합니다.");
            } else {
                return;
            }

            if(payment.equals("교통카드")) {
                System.out.println("요금을 교통카드로 지불합니다.");
            } else if(payment.equals("현금")) {
                System.out.println("요금을 현금으로 지불합니다.");
            } else if(payment.equals("지역주민")) {
                System.out.println("지역 주민입니다. 10% 할인됩니다.");
                rate -= 10;
            } else {
                return;
            }

            charge = price * rate / 100;
            System.out.println("요금: " + charge);
            System.out.println("-------------------------------");
            money += charge;
            totalMoney += charge;
            totalPassenger++;
        } else {
            System.out.println("승차 인원이 초과되었습니다. 다음 버스를 타세요.");
        }
    }

    void leave() {
        passengerCount--;
        totalPassenger--;
        System.out.println("1명이 하차합니다.");
    }

    void stop() {
        super.stop();
        station++;
        if(station == stations.length) {
            station = 0;
        }
        System.out.println("이번역은 " + stations[station] + "역 입니다.");
    }

    String getBusInfo() {
        return "버스번호: " + no
                + ", 종류: " + type
                + ", 현재 위치: " + stations[station]
                + ", 남은 좌석: " + (maxPassenger - passengerCount)
                + ", 요금: " + price
                + ", 수익: " + money;
    }

    static String totalBusInfo() {
        return "----------------\n현재 모든 버스 통합정보\n"
                + "운행 버스 수: " + busCount
                + ", 승객 수: " + totalPassenger
                + ", 수익: " + totalMoney;
    }
}
