package homework.homework.practice.inherit.C05overriding;

class Point01 {
    int x;
    int y;

    Point01(int x, int y) {
        this.x = x;
        this. y = y;
    }


    String getLocation() {
        return "x :" + x + " y : " + y;
    }
}

class MySub02 extends Point01 {
    int z;

    MySub02(int a, int b, int c){
        super(a,b);
        z = c;
    }

    public String getLocation() {
        return "x :" + x + " y : " + y + "z : " + z;
    }
}
public class C06super {
    public static void main(String[] args) {
        MySub02 m = new MySub02(2,4,10);
//        m.x = 2;
//        m.y = 4;
//        m.z = 10;
        System.out.println(m.getLocation());

    }
}
