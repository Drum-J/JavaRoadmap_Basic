package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        // data 초기화
        data = new Data();
        System.out.println("2. data = " + data);
        System.out.println("2-1. data.value = " + data.value);

        // data 다시 null 설정
        data = null;
        System.out.println("3. data = " + data);
    }
}
