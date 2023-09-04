package project2.Class.ch09nested.lecture;

import project2.Class.ch08interface.book.sec10.C;

public class inte {
}

class MyClass08 {
    interface NestedInterface {


        void method2();
    }

    void method1() {
        class ConcreteClass implements NestedInterface{
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }
        ConcreteClass c = new ConcreteClass();

    }
}
