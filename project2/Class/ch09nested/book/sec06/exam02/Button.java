package project2.Class.ch09nested.book.sec06.exam02;

public class Button {
    public static interface ClickListener {
        void onClick();
    }
    private ClickListener clickListener;
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
}