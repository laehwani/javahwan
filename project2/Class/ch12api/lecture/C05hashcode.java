package project2.Class.ch12api.lecture;

    // 해쉬코드에 대해..
public class C05hashcode {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        int hashcode1 = o1.hashCode();
        int hashcode2 = o2.hashCode();

        System.out.println(hashcode1);
        System.out.println(hashcode2);

        System.out.println(o3.hashCode());
    }
}
