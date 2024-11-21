package static2;
import static static2.DecoData.*; // 자주 호출한다면 import를 고려하자

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4. 정적 호출2");
        DecoData data3 = new DecoData();
        data3.staticCall(); // 인스턴스를 통한 정적 메서드 접근 (권장하지 않음)

        System.out.println("5. 정적 호출3");
        staticCall(); // 클래스를 통한 정적 메서드 접근
    }
}
