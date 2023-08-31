package project2.Class.ch08interface.book.exercise;

import project2.Class.ch08interface.book.sec02.RemoteControl;

public class TV implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
