package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);

        System.out.println("값: " + counter.getCount());
        counter.increment();
        System.out.println("값: " + counter.getCount());
        counter.increment();
        System.out.println("값: " + counter.getCount());
        counter.increment();
        System.out.println("값: " + counter.getCount());
        counter.increment();
        System.out.println("값: " + counter.getCount());
    }
}
