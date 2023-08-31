package project2.Class.ch08interface.book.sec02;

public class Television implements RemoteControl{
    @Override
    public void trunOn() {
        System.out.println("텔레비전을 켭니다");
    }
}
