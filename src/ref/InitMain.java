package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData initData = new InitData();
        System.out.println("value1 = " + initData.value1);
        System.out.println("value2 = " + initData.value2);

        int initValue1;
        int initValue2 = 10;

        //System.out.println("initValue1 = " + initValue1); // 초기화를 하지 않아서 에러가 발생한다.
        System.out.println("initValue2 = " + initValue2);
    }
}
