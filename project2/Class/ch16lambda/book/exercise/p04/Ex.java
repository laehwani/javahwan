package project2.Class.ch16lambda.book.exercise.p04;

public class Ex {
    public static void main(String[] args) {
        Thread thread = new Thread(()->
                System.out.println("작업스레드가 실행됩니다")
        );
        thread.start();
    }
}
