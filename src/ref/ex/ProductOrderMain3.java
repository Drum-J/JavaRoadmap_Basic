package ref.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ProductOrderMain3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        writer.write("입력할 주문의 개수를 입력하세요 : ");
        writer.flush();

        int orderCount = Integer.parseInt(reader.readLine());

        ProductOrder[] orders = new ProductOrder[orderCount];

        for (int i = 0; i < orderCount; i++) {
            /*
            writer.write("상품명 : ");
            writer.flush();
            String productName = reader.readLine();

            writer.write("가격 : ");
            writer.flush();
            int price = Integer.parseInt(reader.readLine());

            writer.write("수량 : ");
            writer.flush();
            int quantity = Integer.parseInt(reader.readLine());
            */

            writer.write("상품명 | 가격 | 수량 순으로 입력해주세요.\n");
            writer.flush();

            StringTokenizer token = new StringTokenizer(reader.readLine());
            String productName = token.nextToken();
            int price = Integer.parseInt(token.nextToken());
            int quantity = Integer.parseInt(token.nextToken());

            orders[i] = createOrder(productName, price, quantity);
        }

        StringBuilder sb = printOrder(orders);

        int totalAmount = getTotalAmount(orders);
        sb.append("총 결졔 금액 : ").append(totalAmount);

        writer.write(sb.toString()); // 데이터 쓰기
        writer.flush(); // write()에 쓴 데이터를 출력
        writer.close(); // 스트림을 닫음
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static StringBuilder printOrder(ProductOrder[] orders) {
        StringBuilder sb = new StringBuilder();
        for (ProductOrder order : orders) {
            sb.append("상품명 : ").append(order.productName)
                    .append(", 가격 : ").append(order.price)
                    .append(", 수량 : ").append(order.quantity)
                    .append("\n");
        }

        return sb;
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }
}
