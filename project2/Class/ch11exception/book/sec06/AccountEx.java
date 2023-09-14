package project2.Class.ch11exception.book.sec06;

import javax.naming.InsufficientResourcesException;

public class AccountEx {

    public static void main(String[] args) {

        Account account = new Account();
        //예금하기
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(30000);
        } catch (InsufficientResourcesException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }

}
