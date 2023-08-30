package project2.Class.lecture;

public class C20polymorphism {
    public static void main(String[] args) {

        Item item = getItem();
        item.Desc();

        Item item1 = getItem();
        item1.Desc();

        System.out.println("게임 종료...");
    }

    private static Item getItem() {
        double i = Math.random();
        if(i < 0.5){
            return new Potion();
        }else {
            return new Map();
        }
    }
}

class Item {
    public void Desc() {
        System.out.println("아이템입니다");
    }
}

class Potion extends Item {
    @Override
    public void Desc() {
        System.out.println("물약이에요");
    }
}
class Map extends Item {
    @Override
    public void Desc() {
        System.out.println("지도를 밝힙니다");
    }
}