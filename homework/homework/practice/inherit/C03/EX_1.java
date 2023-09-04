package homework.homework.practice.inherit.C03;

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channeldown() {
        --channel;
    }
}

class SmartTv extends Tv {
    // Tv의 멤버들을 전부 상속받으면서 캡션(자막) 을 보여주는 기능을 추가할 것이다.
    boolean caption; // 캡션 상태 (on / off)

    void displayCaption(String text) {  // 매개변수 text
        if (caption) {
            System.out.println(text);
            // 캡션(자막) 상태가 참일때만 text를 출력
        }
    }
}
public class EX_1 {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        tv.channel = 10;    // 상속받은 멤버
        tv.channelUp();     // 상속받은 멤버
        System.out.println(tv.channel);
        tv.displayCaption("헬로");
        tv.caption = true;  // 자막 기능을 켠다.
        tv.displayCaption("헬로");

    }
}
