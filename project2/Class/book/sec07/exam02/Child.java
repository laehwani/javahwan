package project2.Class.book.sec07.exam02;

public class Child extends Parent{
    @Override
    public void method01() {
        super.method01();
        System.out.println("Child.method01");
    }

    @Override
    public void method02() {
        super.method02();
        System.out.println("Child.method02");
    }
}
