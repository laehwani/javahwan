package project2.Class.ch05Reference;

public class C13enum {

    public static void main(String[] args) {

        MyEnum v1 = MyEnum.value1;
        MyEnum v2 = MyEnum.value2;
        MyEnum v3 = MyEnum.value3;
        MyEnum v4 = MyEnum.MY_FIRST_VALUE;
        MyEnum v5 = MyEnum.value3;

        System.out.println("(v1==v2) : " + (v1 == v2));
        System.out.println("(v3==v4) : " + (v3 == v4));
        System.out.println("(v3==v5) : " + (v3 == v5));

        System.out.println(v1.equals(v2));
        System.out.println(v3.equals(v5));

    }
}

enum MyEnum {
    // 콤마로 구분한 값 나열
    // 값의 이름 작성 관습 : UPPER_SNAKE_CASE
    value1,
    value2,
    value3,
    MY_FIRST_VALUE
}