package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 15;

    // field 에서 초기화가 되었기 때문에 생성자에서 변경 불가
    /*
    public FieldInit(int value) {
        this.value = value;
    }
    */
}
