package project2.Class.book.exercise.p04.package2;

import project2.Class.book.exercise.p04.package1.MyClass;

public class MySubClass extends MyClass {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        // 자식클래스에서 접근제한자가 부모보다 범위가 넓은건 쓸 수 있다.
        // 범위가 좁은건 쓸 수 없다.
        // 부모가 protected 이고 자식이 public 이기 때문에 쓸 수 있다.
    }

    @Override
    protected void method3() {

    }
}
