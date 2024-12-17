package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메소드 호출 후: a = " + a);
    }

    private static void changePrimitive(int x) {
        System.out.println("메소드 호출!");
        x = 20;
        System.out.println("메소드 안에서만 x값이 변경 됩니다. x = " + x);
    }
}
