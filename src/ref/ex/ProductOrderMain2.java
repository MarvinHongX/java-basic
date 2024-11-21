package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productOrders = new ProductOrder[count];

        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName, price, qty);
        }

        printOrders(productOrders);
        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
    }

    static ProductOrder createOrder(String productName, int price, int qty) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.qty = qty;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.qty);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.qty;
        }
        return sum;
    }
}
