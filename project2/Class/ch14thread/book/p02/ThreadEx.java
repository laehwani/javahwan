package project2.Class.ch14thread.book.p02;

public class ThreadEx {

    public static void main(String[] args) {

        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MovieThread());
        thread2.start();
    }
}

class MovieThread extends Thread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("동영상을 재생해요");
            System.out.println("음악을 재생해요");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        for (int i = 0; i < 3; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

}