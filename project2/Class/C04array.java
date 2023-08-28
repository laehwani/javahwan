package project2.Class;

public class C04array {
    public static void main(String[] args) {
        int[] a = {3, 4};

        System.out.println(a[0]);

        a= method();

        System.out.println("a[0] : " + a[0]);
    }

    public static int[] method() {
        int[] k = {22, 23};
        return k;
    }
}
