package project2.Class.ch09nested.book.sec06.exam03;

public class ButtonEx {
    public static void main(String[] args) {
        Button btnOk = new Button();
        // Ok 버튼 객체 생성

        class OkListener implements Button.ClickListener {
            // Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스( 로컬 클래스 )
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭하였습니다.");
            }
        }
        btnOk.setClickListener(new OkListener());
        // Ok 버튼 객체 ClickListener 구현 객체 주입
        btnOk.click();
        // Ok 버튼 클릭하기

        Button btnCancel = new Button();
        // Cancel 버튼 객체 생성

        class CancelListener implements Button.ClickListener {
            // Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스( 로컬 클래스 )
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭하였습니다.");
            }
        }
        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();

    }

}
