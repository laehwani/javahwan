package project2.Class.ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {

        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();
        // 단 제네릭타입설정은 참조타입만 가능하다.
//        MyClass02<int> o5 = new MyClass02<int>();    == 에러
//        MyClass02<char> o6 = new MyClass02<char>();  == 에러

        MyClass02<Object> o5 = new MyClass02<>();
        MyClass02<String> o6 = new MyClass02<>();
        // 제네릭타입설정때 new 뒤에는 생략해도 된다. 앞에서 유추가 되기 때문에.
    }
}

    // generic type
class MyClass02<T> {
    // <T> 타입 파라미터 : T 라는 타입을 나중에 결정하겠다 라는 뜻을 가진다.
    private T a;

}
