package project2.Class.ch16lambda.lecture;

import java.util.List;

public class C04parameter {
    public static void main(String[] args) {

        MyInterface04 o1 = (int x)-> {};
        MyInterface04 o2 = (x)-> {};
        // 밑의 식은 파라미터가 1개만 있다면 ( ) 소괄호는 생략해도 된다는 뜻.
        MyInterface04 o3 = x -> {};

    }
}

interface MyInterface04 {
    void method01(int x);

}
