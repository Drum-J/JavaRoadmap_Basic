package oop1.ex.account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000); // 오류 메세지 출력

        System.out.println("통장 잔고 : " + account.balance);
    }
}
