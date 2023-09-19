package project2.Class.ch14thread.lecture;

import java.awt.Toolkit;

public class C06runnable {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {

            for (int i = 0; i < 3; i++) {
                System.out.println("띵");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Toolkit toolkit = Toolkit.getDefaultToolkit();
//                for (int i = 0; i < 3; i++) {
//                    toolkit.beep();
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread2.start();
        Thread thread2 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 3; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.start();
    }

}
