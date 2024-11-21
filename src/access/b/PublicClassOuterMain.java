package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지에서 접근 불가
//        access.a.DefaultClass1 class1 = new access.a.DefaultClass1();
//        access.a.DefaultClass2 class2 = new access.a.DefaultClass2();
    }
}
