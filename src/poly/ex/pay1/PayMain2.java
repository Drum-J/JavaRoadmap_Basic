package poly.ex.pay1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 사용자 입력
 * try-with-resources 를 사용하면 reader,writer 의 close() 를 호출 하지 않아도 자동으로 닫는다.
 */
public class PayMain2 {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            PayService payService = new PayService();

            while (true) {
                writer.write("결제 수단을 입력하세요: ");
                writer.flush();
                String payOption = reader.readLine();
                if (payOption.equals("exit")) {
                    break;
                }

                writer.write("결제 금액을 입력하세요: ");
                writer.flush();
                int amount = Integer.parseInt(reader.readLine());
                payService.processPay(payOption, amount);
            }

            writer.write("프로그램을 종료합니다.");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
