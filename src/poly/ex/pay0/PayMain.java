package poly.ex.pay0;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        String payOption3 = "cupang";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        String payOption4 = "google";
        int amount4 = 18000;
        payService.processPay(payOption4, amount4);

        String payOption5 = "temu";
        int amount5 = 8000;
        payService.processPay(payOption5, amount5);
    }
}
