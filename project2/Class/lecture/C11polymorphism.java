package project2.Class.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        //  Strign t = o;  이거는 안된다.

        int v1 = s.hashCode();
        int v2 = o.hashCode();

        System.out.println("v1 = "+ v1);
        System.out.println("v2 = "+ v2);

    }
}
