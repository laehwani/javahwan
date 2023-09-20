package project2.Class.ch05Reference;


enum MySeason {
    SPRING,
    SUMMER,
    FALL,
    WINTER
}

public class C14enum {

    public static void main(String[] args) {

        MySeason m1 = MySeason.FALL;

        System.out.println(m1.toString());
        System.out.println(m1.hashCode());
        System.out.println(m1.equals(null));

    }

}
