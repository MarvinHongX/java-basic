package extends1.overriding;

public class HydrogenCar extends Car {

    @Override
    public void move(){
        System.out.println("수소차를 안전하게 이동합니다.");
    }
    public void fillHydrogen() {
        System.out.println("수소를 충전합니다.");
    }
}
