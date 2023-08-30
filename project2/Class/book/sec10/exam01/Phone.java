package project2.Class.book.sec10.exam01;

public abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnon() {
        System.out.println("폰 전원을 켭니다");
    }
    void turnoff() {
        System.out.println("폰 전원을 켭니다");
    }
}
