package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int n) {
        System.out.println("method1 start");
        int x = n * 2;
        method2(x);
        System.out.println("method1 end");
    }

    static void method2(int n) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }


    /*
    스택 영역

       \
    |(method2)|    |  \      |     |         |
    | method1 |    |(method1)|     |  \      |
    | main    |    | main    |     |(main    )|
    -----------    -----------     -----------
    */
}
