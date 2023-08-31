package project2.Class.lecture;

    // 접근제한자 (access modifier) 에 대해...
public class C30accessModifier {
    public static void main(String[] args) {
        // 접근제한자 (access modifier)
        // public   : 가장 넓은 범위, 어디서든지 접근 가능
        // protected: 같은 패키지내, 다른 패키지에 있는 상속받은 자식 클래스에서 접근 가능
        // (package private, default)  : 같은 패키지 내에서만 접근가능
        // private  : 가장 좁은 범위, 해당 클래스내에서만 접근 가능

        MyClass30 o1 = new MyClass30();
        // o1.publicmethod(); 안된다.
        o1.pakagePrivateMethod();
        // o1.pakagePrivateMethod(); 된다.
    }
}

