package project2.Class.lecture;

public class C10polymorphism {
    public static void main(String[] args) {
        Mala dog1 = new Mala();
        Chiwa dog2 = new Chiwa();
        Canidae can1 = dog1;
        Canidae can2 = dog2;

        Animal10 ani1 = dog1;
        Animal10 ani2 = dog2;

        dog1.breath();
        dog2.breath();

        ani1.cry();
        ani2.cry();
        can1.cry();
        can2.cry();


    }
}

class Animal10 {
    public void breath() {
        System.out.println("숨쉬다");
    }

    public void cry() {
        System.out.println("동물이 운다");
    }
}

class Canidae extends Animal10 {

}

class Mala extends Canidae {
    @Override
    public void cry() {
        super.cry();
        System.out.println("말라뮤트는 왕왕");
    }
}

class Chiwa extends Canidae {
    @Override
    public void cry() {
        super.cry();
        System.out.println("치와와는 왈왈");
    }
}