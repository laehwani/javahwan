package project2.Class.ch16lambda.book.exercise.p07;
interface Operator {
    int apply(int x, int y);
}

public class Example {
    private static int[] scores = {10, 5, 3};

    static int sc(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = sc((a,b)-> (a < b) ? b : a);

        System.out.println("최대값 : " + max);
        int min = sc((a,b)-> (a > b) ? b : a);

        System.out.println("최소값 : " + min);
    }
}
