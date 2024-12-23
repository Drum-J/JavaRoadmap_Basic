package static2;

import static static2.DecoData.staticCall; // static import

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        // 인스턴스의 메서드를 호출하는 것 같은 오해를 주기 때문에 추천 안함.
        data3.staticCall();

        // 클래스를 통한 접근
        staticCall();
    }
}
