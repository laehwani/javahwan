package project2.Class.ch16lambda.lecture;

public class C05return {
    MyInterface05 o1 = ()-> {
        System.out.println("명령문1");
        System.out.println("명령문1");
        return 0;
    };
    MyInterface05 o2 = ()-> 0;

}

@FunctionalInterface
interface MyInterface05 {
    int method01();
}

//class MyClass05 implements MyInterface05 {
//    @Override
//    public int method01() {
//        return 0;
//    } // 평범한 식
//}
