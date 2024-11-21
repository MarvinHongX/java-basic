package access.a;

// public class 는 파일명과 이름이 같아야 한다.
// public class 는 하나만 만들 수 있다.
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// default class 는 무한정 만들 수 있다.
class DefaultClass1 {

}

class DefaultClass2 {

}