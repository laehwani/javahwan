package homework.homework.practice.inherit.C05overriding;

class Point {
    int x;
    int y;
    String getLocation(){
        return "x :"+ x +" y : "+ y;
    }
}

class MySub01 extends Point {
    int z;

    MySub01(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }

    public String getLocation() {
        return "x :" + x + " y : " + y + "z : " + z;
    }
}
public class OverridingTest {
    public static void main(String[] args) {
        MySub01 m = new MySub01(2,4,10);
//        m.x = 2;
//        m.y = 4;
//        m.z = 10;
        System.out.println(m.getLocation());

    }
}
