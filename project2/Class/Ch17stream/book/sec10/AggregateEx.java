package project2.Class.Ch17stream.book.sec10;

import java.util.Arrays;

public class AggregateEx {
    public static void main(String[] args) {

        int[] arr = {2,5,4,3,9};

        // 2의 배수 갯수 구하기
        long count = Arrays.stream(arr)
                .filter(n-> n%2 == 0)
                .count();
        System.out.println("2의 배수 개수 = " + count);

        // 2의 배수 총합 구하기
        long sum = Arrays.stream(arr)
                .filter(n-> n%2 ==0)
                .sum();
        System.out.println("2의 배수의 합 = " + sum);

        // 2의 배수 평균 구하기
        double avg = Arrays.stream(arr)
                .filter(n-> n%2 ==0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수의 평균 = " + avg);

        // 최대값
        int max = Arrays.stream(arr)
                .filter(n-> n%2 ==0)
                .max()
                .getAsInt();
        System.out.println("2의 배수의 최대값은 = " + max);

        int min = Arrays.stream(arr)
                .filter(n-> n%2 ==0)
                .min()
                .getAsInt();
        System.out.println("2의 배수의 최소값은 = " + min);

        // 첫 번째 원소
        int first = Arrays.stream(arr)
                .filter(n-> n%3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("첫 번째 3의 배수는 = " + first);


    }
}
