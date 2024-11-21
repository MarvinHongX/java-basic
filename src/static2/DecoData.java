package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        instanceValue++; // static 메서드는 인스턴스 변수 접근 불가, compile error
//        instanceMethod(); // static 메서드는 인스턴스 메서드 접근 불가, compile error

        staticValue++; // 누구나 static 변수 접근 가능
        staticMethod(); // 누구나 static 메서드 접근 가능
    }

    public void instanceCall(){
        instanceValue++; // 인스턴스 메서드는 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드는 인스턴스 메서드 접근 가능

        staticValue++; // 누구나 static 변수 접근 가능
        staticMethod(); // 누구나 static 메서드 접근 가능
    }

    public void instanceMethod(){
        System.out.println("instanceMethod: " + instanceValue);
    }

    public static void staticMethod(){
        System.out.println("staticMethod: " + staticValue);
    }
}