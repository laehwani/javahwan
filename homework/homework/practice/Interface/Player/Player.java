package homework.homework.practice.Interface.Player;

public class Player {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fight f2 = f.fighter();
        // 상속받는 클래스에서 생성자를 생성하는 경우의 메인식

        Fight f3 = new Fighter();
        f3.move(100,200);
        f3.attack(new Fighter());
        // 상속받는 클래스에서 생성자없이 메서드만 완성했을 경우의 메인식.
    }
}
