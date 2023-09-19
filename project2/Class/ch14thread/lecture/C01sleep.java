package project2.Class.ch14thread.lecture;

public class C01sleep {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("code1");
        Thread.sleep(2000);
        System.out.println("code2");
        Thread.sleep(2000);
        System.out.println("code3");
    }

}
