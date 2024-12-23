package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        //data1 = 15; // 컴파일 오류
        System.out.println("data1 = " + data1);

        // final 지역 변수2
        final int data2 = 10;

        // method parameter final
        method(10);
    }

    static void method(final int parameter) {
        //parameter = 20; // 컴파일 오류
        System.out.println("final parameter = " + parameter);
    }
}
