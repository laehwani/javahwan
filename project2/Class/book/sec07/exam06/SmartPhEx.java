package project2.Class.book.sec07.exam06;


public class SmartPhEx {
    public static void main(String[] args) {
        SmartPh smart = new SmartPh("갤럭시", "은색");
        // 스마트폰 객체 생성

        System.out.println("모델 : "+ smart.model);
        System.out.println("모델 : "+ smart.color);
        // Phone 으로부터 상속받은 필드 읽기.

    }
}
