package project2.Class.lecture.package1;

import project2.Class.lecture.MyClass30;

public class C31accessModifier {
    public static void main(String[] args) {
        MyClass30 o1 = new MyClass30();
//        o1.privateMethod();  // 안 됨
        o1.publicmethod();
//        o1.pakagePrivateMethod();   // 안 됨


    }
}
