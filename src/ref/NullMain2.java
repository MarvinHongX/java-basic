package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data = new Data();
        data.value = 10; // java.lang.NullPointerException
        System.out.println("data.value = " + data.value);
    }
}
