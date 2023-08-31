package project2.Class.ch08interface.book.sec08;

public class MultiInterfaceEx {
    public static void main(String[] args) {
        RemoteControl r = new SmartTelevision();
        // RemoteControl 인터페이스 변수 선언 및 구현 객체 주입
        r.turnOn();
        r.turnOff();
        // RemoteContrl 인터페이스에 선언된 추상 메서드만 호출 가능

        Searchable s = new SmartTelevision();
        // Searchable 인터페이스 변수 선언 및 구현 객체 주입
        s.search("https://www.youtube.com/");
        // Searchable 인터페이스에 선언된 추상 메서드만 호출 가능
    }
}
