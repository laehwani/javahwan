package project2.Class.ch12api.lecture;

public class C09equals {
    public static void main(String[] args) {
        Object o1 = new String("java");
        Object o2 = new String("java");
        Object o3 = new String("spring");

        System.out.println(o1 == o2);   // false
        System.out.println(o1 == o3);   // false

        System.out.println(o1.equals(o2));  // true
        // 객체는 다르지만 안에 값이 같기때문에 .equals 를 통해 true 로 만든다.
        System.out.println(o1.equals(o3));  // false
    }
}
