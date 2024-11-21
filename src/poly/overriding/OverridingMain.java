package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child value: " + child.getValue());
        child.method();

        Parent parent = new Parent();
        System.out.println("parent value: " + parent.getValue());
        parent.method();

        Parent poly = new Child();
        System.out.println("poly value: " + poly.value); // 변수는 오버라이딩이 안된다.
        System.out.println("poly value: " + poly.getValue()); // 메서드는 오버라이딩이 된다.
        poly.method(); // 메서드는 오바라이딩이 된다.
    }
}
