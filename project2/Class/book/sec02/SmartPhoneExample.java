package project2.Class.book.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("모델: " + myPhone.color);

        System.out.println("와이파이 상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.senVoice("여보세요");
        myPhone.receiveVoice("안녕하세요!!!");
        myPhone.senVoice("네 반갑습니다~");
        myPhone.hangup();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
