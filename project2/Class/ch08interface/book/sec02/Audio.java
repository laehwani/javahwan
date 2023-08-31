package project2.Class.ch08interface.book.sec02;

public class Audio implements RemoteControl{
    @Override
    public void trunOn() {
        System.out.println("라디오를 켭니다");
    }
}
