package project2.Class.ch14thread.lecture;

import java.awt.Toolkit;

public class C02thread {

    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        toolkit.beep();
        // 사운드 출력 명령어
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            Thread.sleep(1000);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            Thread.sleep(1000);
        }
    }
}
