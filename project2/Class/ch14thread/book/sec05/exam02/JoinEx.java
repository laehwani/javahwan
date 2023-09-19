package project2.Class.ch14thread.book.sec05.exam02;

public class JoinEx {

    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1~100 합 : " + sumThread.getSum());
    }

}
