package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 또는 같은 패키지
//        defaultValue = 1; // 같은 패키지가 아님, compile error
//        privateValue = 1; // 접근 불가, compile error

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
