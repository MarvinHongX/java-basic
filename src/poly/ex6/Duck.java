package poly.ex6;

public class Duck extends Animal implements Fly, Swim {
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("오리가 날다.");
    }

    @Override
    public void swim() {
        System.out.println("오리가 헤엄칩니다.");
    }
}