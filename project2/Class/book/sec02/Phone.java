package project2.Class.book.sec02;

public class Phone {
    public String model;
    public String color;

    public void bell() {
        System.out.println("벨이 울립니다.");
    }
    public void senVoice(String message) {
        System.out.println("자기 : "+ message);
    }
    public void receiveVoice(String message) {
        System.out.println("상대방 : "+ message);
    }
    public void hangup() {
        System.out.println("전화를 끊습니다.");
    }
}

