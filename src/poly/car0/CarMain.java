package poly.car0;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(k3Car);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}