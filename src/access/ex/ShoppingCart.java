package access.ex;

public class ShoppingCart {
    private Item[] items;
    private int count;

    public ShoppingCart() {
        int max = 10;
        items = new Item[max];
        count = 0;
    }
    public void addItem(Item item) {
        if (isFulled()) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[count++] = item;
    }
    private boolean isFulled(){
        return count >= items.length;
    }
    public void displayItems(){
        if (items.length < 1) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].getName() + " " + items[i].getAmount());
            sum += items[i].getAmount();
        }
        System.out.println("전체 합계: " + sum);
    }
}
