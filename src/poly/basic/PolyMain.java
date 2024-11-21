package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // 다형적 참조
        Parent poly = new Child();
        poly.parentMethod();

//        Child child1 = new Parent() // compile error

    }
}
