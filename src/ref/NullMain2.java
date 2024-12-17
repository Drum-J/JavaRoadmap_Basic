package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // null.value 를 하고 있기 때문에 NPE 발생!
        System.out.println("data.value = " + data.value); // 해당 코드에 도착하기 전에 Exception이 발생한다.

    }
}
