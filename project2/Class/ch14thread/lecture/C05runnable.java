package project2.Class.ch14thread.lecture;

public class C05runnable {

    public static void main(String[] args) {
        Runnable r1 = new MyThread2();
        Thread thread1 = new Thread(r1);
        thread1.start();

        Runnable r2 = new YourThread();
        Thread thread2 = new Thread(r2);
        thread2.start();
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("데몬 쓰레드 실행 중: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class YourThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("데몬 쓰레드 실행 중: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}