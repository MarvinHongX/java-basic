package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // 인스턴스 생성을 막는다. (static을 사용하라는 의도 전달)
    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        return sum;
    }

    public static double average(int[] array){
        return (double) sum(array) / array.length;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
}
