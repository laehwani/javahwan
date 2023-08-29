package project2.Class.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        Mala1 o1 = new Mala1();
        o1.breath();
        o1.sniff();

        Animal12 ani = o1;
        ani.breath();
//        ani.sniff();  <- 안됨 역방향이라서

        Animal12 ani12 = new Mala1();
        ani12.breath();
//        ani12.sniff();   <- 안됨 역방향이라서
    }
}

class Animal12 {
    public void breath() {
        System.out.println("숨쉬다");
    }
}

class Mala1 extends Animal12 {
    public void sniff() {
        System.out.println("냄새를 맡다");
    }
}