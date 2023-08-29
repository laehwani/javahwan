package project2.Class.book.sec07.exam03.polymopihsm;

public class ChildEx {
    public static void main(String[] args) {
        Parent o1 = new Child();
        // 객체 생성 및 자동 타입 변환

        o1.field = "data";
        o1.method1();
        o1.method2();
        // o1 타입으로 필드와 메서드 사용

//        o1.field02 = "data2";
//        o1.method3();
        // Parent 부모객체기 때문에 Child에만 있는것은 Parent 가 쓸수 없다.

        Child o2 = new Child();

        o2.field02 = "data2";
        o2.method03();
    }
}
