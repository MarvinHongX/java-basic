package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println(dataA); // x001
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20

    }
    static void changeReference(Data data) {
        System.out.println(data); // x001
        data.value = 20;
    }
}
