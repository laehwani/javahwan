package project2.Class.ch08interface.book.sec08;

public class SmartTelevision implements RemoteControl,Searchable{
    @Override
    public void turnOn() {
        System.out.println("티비를 켜욧!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 꺼욧!!!!!!!");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다");
    }
}
