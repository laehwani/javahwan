package project2.Class.lecture.package1;

import project2.Class.lecture.MyClass30;

public class MySub30 extends MyClass30 {
    public void someMethod() {
//        super.privateMethod();     // 안 됨
        super.publicmethod();
        super.protectedMethod();
//        super.pakagePrivateMethod   // 안 됨
//        super.privateMethod     // 안 됨
    }
}
