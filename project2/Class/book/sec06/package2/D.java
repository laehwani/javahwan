package project2.Class.book.sec06.package2;

import project2.Class.book.sec06.package1.A;

public class D extends A{
        public D() {
            super();
        }

        public void method1() {
            // A 필드값 변경
            this.field = "value";
            // A 메서드 호출
            this.method();
        }

//        public void method2() {
//            A a = new A();
//            a.field ="value";
//            a.method();
//        }
//        //  직접 객체를 생성해서 사용하는 것은 안됨

}
