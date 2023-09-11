package homework.homework.practice.GenericTest;

import java.util.ArrayList;

class Tv {

}

class Audio extends Tv {

}
public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>();
        list.add(new Tv());
        list.add(new Audio());

    }
}
