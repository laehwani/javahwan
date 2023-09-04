package homework.homework.practice.inherit.C04;

import homework.homework.practice.inherit.Parent;
import project2.Class.ch08interface.book.sec10.C;

class Point01 {
    int x;
    int y;
}

//class Circle extends Point01 {
//    int r;
//}
class Circle {
    Point01 p = new Point01();
    int r;
}
public class InheritTest {
    public static void main(String[] args) {
        Circle c = new Circle();
//        c.x = 2;
//        c.y = 4;
//        c.r = 10;
//        System.out.println(c.x+c.y);
        c.p.x = 2;
        c.p.y = 4;
        c.r = 10;
        System.out.println(c.p.x+c.r);
    }
}
