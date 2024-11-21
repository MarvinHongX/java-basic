package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }
    public void increment() {
        if ((count + 1) > max) {
            System.out.println("더 이상 값을 증가시킬 수 없습니다.");
            return;
        }
        count++;
    }
    public int getCount() {
        return count;
    }
}
