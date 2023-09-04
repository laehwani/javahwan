package project2.Class.ch09nested.book.exercise.p05;

public class ActionEx {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("액션워크!");
            }
        };
        action.work();

        Action action1 = ()-> System.out.println("복사를 합니다");
        action1.work();
    }
}
