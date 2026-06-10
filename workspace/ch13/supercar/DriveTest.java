package ch13.supercar;

public class DriveTest {
    public static void main(String[] args) {
        GasolineCar gCar = new GasolineCar(8);
        HybridCar hCar = new HybridCar(7);
        ElectricCar eCar = new ElectricCar(4);
        PlugInHybridCar pCar = new PlugInHybridCar(5);

        Driver driver = new Driver();


        driver.drive(gCar);
        driver.drive(hCar);
        driver.drive(eCar);
        driver.drive(pCar);

    }
}
