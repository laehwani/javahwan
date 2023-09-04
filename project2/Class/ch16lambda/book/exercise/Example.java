package project2.Class.ch16lambda.book.exercise;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClicklistener(()-> System.out.println("Ok 버튼을 클릭했어요"));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClicklistener(()-> System.out.println("Cancel 버튼을 클릭했어요"));
        btnCancel.click();
    }
}
