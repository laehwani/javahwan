package homework.homework.practice.innerClass;

class AA {
    // AA 에서 BB 클래스를 사용하려면? BB 의 객체를 생성한다.
    BB b = new BB();

    int i= 100;
    class BB {
        // 클래스 BB 를 AA 클래스의 내부 클래스로 집어넣어보았다.
        // 내부클래스 BB 는 외부클래스인 AA 안에서만 작동이 가능해진다.(일회성이라고 표현)
        void method() {
            System.out.println(i);
        }
        // AA 객체 생성을 따로 하지 않아도 AA 의 멤버를 접근가능해졌다.( 캡슐화 )
    }
}
//class BB {
//    // BB 에서 AA 클래스를 사용하려면? AA 의 객체를 생성한다.
//    void method() {
//        AA a = new AA();
//        System.out.println(a.i);
//    }
//}

class CC {
    // CC 에서 BB 클래스를 사용하려면? BB 의 객체를 생성한다.
//    BB b = new BB();
//    // BB 클래스가 AA 의 내부클래스이기 때문에 바깥에서 BB 에 접근할 수 없어졌다.
}
public class InnerTest {
    public static void main(String[] args) {
//        BB b = new BB();
//        b.method();
        // 에러. BB 가 내부클래스가 됨으로써 독립적인 클래스가 아닌 AA 의 멤버와 같아졌다.
    }
}
