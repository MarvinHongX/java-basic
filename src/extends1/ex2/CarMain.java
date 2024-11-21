package extends1.ex2;

import extends1.ex1.ElectricCar;
import extends1.ex1.GasCar;

public class CarMain {
    public static void main(String[] args) {
        extends1.ex1.ElectricCar electricCar = new ElectricCar();
        extends1.ex1.GasCar gasCar = new GasCar();

        electricCar.move();
        gasCar.move();

        electricCar.charge();
        gasCar.fillUp();
    }
}
