package homework.homework.practice.Interface.Player;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("현재 위치에 정지");
    }
}

interface Fight {
    void move(int x, int y);
    void attack(Fight f);
    // Fight 인터페이스를 상속받는 애만 이 메서드를 사용할 수 있다는 의미의 매개변수 f
}
class Fighter extends Unit implements Fight{
    @Override
    public void move(int x, int y) {
        System.out.println("["+x+", "+y+"] 로 이동");
    }
    @Override
    public void attack(Fight f) {
        System.out.println(f + "를 공격");
    }

    public Fight fighter() {
        Fight f = new Fighter();  // Fighter 를 생성해서 반환
        return f;
    }
}
