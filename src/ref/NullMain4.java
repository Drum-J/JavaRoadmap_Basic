package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // data 초기화!
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NPE 발생 하지 않음.
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
