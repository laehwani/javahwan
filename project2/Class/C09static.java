package project2.Class;

public class C09static {
    public static void main(String[] args) {
        MyClass09 o1 = new MyClass09();
        o1.name = "java";
        MyClass09.model = "hello";

        o1.printname();
        MyClass09.printmode1();


    }
}

class MyClass09 {
    String name;
    // 인스턴스 필드
    static String model;

    // 클래스 필드
    void printname() {
        // 인스턴스 멤버 끼리 접근 가능
        System.out.println("name = " + name);
        // 인스턴스 멤버에서 static 멤버 접근 가능
        System.out.println("model = " + model);


        }
        static void printmode1(){
            // 스태틱 멤버끼리 접근 가능
            System.out.println("model = " + model);

            // static member 에서 instance member 는 접근 불가능
//            System.out.println("name = " + name);
    }
}
