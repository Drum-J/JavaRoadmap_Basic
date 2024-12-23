package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();

        member.changeData("myId2", "seo"); // 이건 잘못된 메서드이다.
        // changeData(String name) 처럼 name 만 받는 메서드를 사용하는게 좋다.
        member.print();
    }
}
