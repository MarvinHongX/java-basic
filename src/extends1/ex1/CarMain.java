package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();

        electricCar.move();
        gasCar.move();

        electricCar.charge();
        gasCar.fillUp();
    }
}
