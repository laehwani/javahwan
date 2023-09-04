package project2.Class.ch16lambda.book.sec01;

    // 람다식....
public class LambdaEx {
    public static void main(String[] args) {
//        action(new Calculable() {
//            @Override
//            public void calculate(int x, int y) {
//                int result = x + y;
//                System.out.println("result : "+ result);;
//            }
//        });
        // 위의 식을 람다식으로 변형하면 아래처럼 코드가 단축된다.
        action((x, y) -> {
            int result = x + y;
            System.out.println("result : "+ result);
        });
        action((x, y) -> {
            int result = x - y;
            System.out.println("result : "+ result);
        });
    }
    static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);

    }
}
