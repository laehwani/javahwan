package project2.Class.ch16lambda.book.sec05.exam02;

interface Comparable {
    int compare(String a, String b);
}
public class Person {
    public void order(Comparable comparable) {
        String a = "길동";
        String b = "동길";

        int result = comparable.compare(a, b);

        if (result < 0){
            System.out.println(a + b);
        } else if (result == 0) {
            System.out.println(a+"은"+ b + " 과 같습니다");
        }else {
            System.out.println(a+"은"+ b + " 보다 뒤에 옵니다");
        }
    }
}
