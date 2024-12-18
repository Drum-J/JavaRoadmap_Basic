package access.ex.cart;

public class ShoppingCart {
    private final Item[] items = new Item[10]; // 최대 10개까지 담을 수 있다.
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        //int totalAmount = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            //totalAmount += item.getTotalPrice();
        }
        //System.out.println("전체 가격 합 : " + totalAmount);
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;

        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }

        return totalPrice;
    }
}
