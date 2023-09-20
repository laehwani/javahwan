package project2.Class.ch12api.lecture;

public class C27reflection {

    public static void main(String[] args) throws Exception {

        MyClass27 o1 = new MyClass27();
        Class<? extends MyClass27> c1 = o1.getClass();
        Class<MyClass27> c2 = MyClass27.class;
        Class<?> c3 = Class.forName("project2.Class.ch12api.lecture;");

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);


    }
}

class MyClass27 {


}
