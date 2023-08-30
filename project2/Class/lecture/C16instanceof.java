package project2.Class.lecture;

    // instanceof 연산자에 대해
    // instanceof 는 상속관계에 있는 객체들의 형변환 가능 여부를 확인하는 연산자이다.
    // 주로 상속 관계에서 부모객체인지 자식 객체인지 확인하는 데 사용된다.
    // 형 변환이 불가능한 즉 타입이 상위 클래스도 하위 클래스도 아닐 경우에는 에러가 난다.
public class C16instanceof {
    public static void main(String[] args) {
        Animal16 ani1 = new Dog16();
        Animal16 ani2 = new Cat16();
        Animal16 ani3 = new Animal16();

        // instanceof 연산자
        // 연산결과 : true or false (boolean 타입의 연산)
        // 좌변 : 참조변수
        // 우변 : 타입

        boolean res1 = ani1 instanceof Animal16;
        boolean res2 = ani1 instanceof Dog16;
        boolean res3 = ani1 instanceof Cat16;

        System.out.println("res1 = "+ res1);
        System.out.println("res2 = "+ res2);
        System.out.println("res3 = "+ res3);

        boolean res4= ani2 instanceof Animal16;
        boolean res5= ani2 instanceof Dog16;
        boolean res6= ani2 instanceof Cat16;

        System.out.println("res4 = "+ res4);
        System.out.println("res5 = "+ res5);
        System.out.println("res6 = "+ res6);

        boolean res7= ani3 instanceof Animal16;
        boolean res8= ani3 instanceof Dog16;
        boolean res9= ani3 instanceof Cat16;

        System.out.println("res7 = "+ res7);
        System.out.println("res8 = "+ res8);
        System.out.println("res9 = "+ res9);

        // 위에 코드들에서 보는것처럼
    }
}

class Animal16{}
class Dog16 extends Animal16{}
class Cat16 extends Animal16{}

