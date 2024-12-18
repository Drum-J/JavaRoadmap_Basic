package pack;

import pack.a.User;

public class PackMain3 {
    public static void main(String[] args) {
        User userA = new User(); // import
        pack.b.User userB = new pack.b.User(); // 명시적으로 적어줘야 한다.
    }
}
