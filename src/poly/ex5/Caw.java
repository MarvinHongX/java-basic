package poly.ex5;

public class Caw implements Animal {
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 움직입니다.");
    }
}
