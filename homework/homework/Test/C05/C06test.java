package homework.homework.Test.C05;

public class C06test {

    // 두 수 (12, 18) 의 최대공약수를 구하시오
    public static void main(String[] args) {

        int num = 12;
        int num2 = 18;
        // 항상 먼저 필드(변수) 선언을 생각하자.
        // 1부터 해가지고 두 필드중에 작은 숫자까지 점점 1씩 키워서 떨어진 수 중에 가장 큰 수를 구하면 될듯

        int small;
        int big;   // num , num2 의 필드가 바뀌는 경우도 고려해보자
        if (num > num2) {
            big = num;
            small= num2;
        } else{
            big = num2;
            small = num;
        }

        int gcd = 1;    // 최대공약수는 항상 1부터 시작하니깐 초기화값 1 준다.
        for (int i=1; i<= small; i++) {
            if (big % i == 0 && small % i == 0) {
                // 두 숫자중 작은 수까지 차례대로 for반복하면서
                // big(큰수)을 i 나눴을때 나머지값 0, small(작은수)를 i 로 나눴을때 나머지값 0

                gcd = i;
                // 1부터 small 숫자까지 반복되면서 if문 조건에 맞는 최종 남는 값이 최대공약수다.
            }
        }
            System.out.println("두 수의 최대공약수는 : "+gcd);

    }
}
