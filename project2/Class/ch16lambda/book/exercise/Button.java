package project2.Class.ch16lambda.book.exercise;

public class Button {
    @FunctionalInterface
    public static interface Clicklistener {
        // 정적 멤버 인터페이스( 함수형 인터페이스 )
        void onClick();
    }

    private Clicklistener clicklistener;

    public void setClicklistener(Clicklistener clicklistener) {
        this.clicklistener = clicklistener;
    }

    public void click() {
        this.clicklistener.onClick();
    }
}
