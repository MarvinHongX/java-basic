package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10; // final을 필드 초기화 하는 경우, 인스턴스 변수로 선언하면 중복으로 인한 메모리 낭비가 야기된다.
}
