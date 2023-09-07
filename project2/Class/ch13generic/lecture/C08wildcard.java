package project2.Class.ch13generic.lecture;

public class C08wildcard {
    public static void main(String[] args) {
        MyClass08<?> o1 = new MyClass08<Animal>();
        MyClass08<?> o2 = new MyClass08<Dog>();
        MyClass08<?> o3 = new MyClass08<Cat>();
        MyClass08<?> o4 = new MyClass08<Object>();

        o1.equals(null);
        o2.toString();
        o3.hashCode();

    }

    public void otherMethod() {
        someMethod(new MyClass08<Dog>());
        someMethod(new MyClass08<Cat>());
        someMethod(new MyClass08<Animal>());
        someMethod(new MyClass08<Object>());
    }

    public void someMethod(MyClass08<?> p) {
        p.hashCode();
        p.equals(null);
        p.toString();
    }
}

class MyClass08<T> {

}
