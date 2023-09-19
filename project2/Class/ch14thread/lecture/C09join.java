package project2.Class.ch14thread.lecture;

public class C09join {

    public static void main(String[] args) {

        // join : 다른 쓰레드의 종료를 기다림

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("t1 스레드 진행중");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // join 메서드를 주석처리 했다 안했다 비교해보자.

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
