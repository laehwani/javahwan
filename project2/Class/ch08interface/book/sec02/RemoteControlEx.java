package project2.Class.ch08interface.book.sec02;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        // rc 변수에 Television 객체 주입
        rc.trunOn();

        rc = new Audio();
        // rc 변수에 Audio 객체 주입
        rc.trunOn();
    }
}
