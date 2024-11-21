package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 dataA = new Data3("a");
        System.out.println("A count = " + Data3.count);

        Data3 dataB = new Data3("b");
        System.out.println("B count = " + Data3.count);

        Data3 dataC = new Data3("c");
        System.out.println("C count = " + Data3.count);

        Data3 dataD = new Data3("d");
        System.out.println("D count = " + dataD.count); // 인스턴스를 통한 static 접근(권장하지 않음)
        System.out.println("D count = " + Data3.count); // 클래스를 통한 static 접근
    }
}
