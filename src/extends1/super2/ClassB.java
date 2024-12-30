package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, a * 2);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB(" + a + ", " + b + ")");
    }
}
