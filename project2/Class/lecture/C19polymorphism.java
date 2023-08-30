package project2.Class.lecture;

    // 다향성 예시 01
public class C19polymorphism {
    public static void main(String[] args) {
        Hero19 myHero = new Hero19();
        myHero.weapon = new Gun();
        myHero.atk();

        myHero.weapon = new Sword();
        myHero.atk();

        myHero.weapon = new Weapon();
        myHero.atk();

        // Hero19 라는 객체를 myHero 상자에 담았다.
        // 그럼으로써 myHero 상자에서 Hero19 라는 객체를 꺼내 쓸수 있다.
        // Hero19 의 weapon 에는 Gun,Sword,Weapn 의 멤버들을 상속해놨기 때문에
        // 그들의 무기와 사용방식을 weapon 으로 조종할 수 있다.
    }
}

class Hero19 {
    public Weapon weapon;

    public void atk() {
        weapon.shot();
    }
}

class Weapon {
    public void shot() {
        System.out.println("무기를 사용합니다");
    }
}

class Gun extends Weapon {
    public void shot() {
        System.out.println("총을 쏩니다");
    }
}

class Sword extends Weapon {
    public void shot() {
        System.out.println("검을 휘두릅니다");
    }
}