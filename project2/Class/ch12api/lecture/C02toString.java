package project2.Class.ch12api.lecture;

    // 오브젝트 클래스에 대해..
public class C02toString {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
        String s1 = o1.toString();
        System.out.println(s1);

        Object o2 = o1;
    }
}

class MyClass02 {
    @Override
    public String toString() {
        return "MyClass02 객체입니다.";
    }
}
