package project2.Class.ch12api.lecture;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        // Arrays : 배열을 다루는 메서드들 있음
        // equals : 두 배열이 같은지
        // fill : 배열을 특정 값으로 채우기
        // sort : 배열 정렬
        // binarySearch : 특정 원소의 위치 찾기
        // toString : 문자열로 변환

        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i< arr1.length; i++){
            arr1[i] = 10;
        }
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,5);
        System.out.println(Arrays.toString(arr1));

        // .sort
        int[] arr2 = {3, 5, 12, 32,2};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        // .sort = 배열의 숫자를 작은수부터 나열
        System.out.println(Arrays.toString(arr2));

        // equals
        int[] arr3 = {3, 4, 5};
        int[] arr4 = {3, 4, 5};
        int[] arr5 = {5, 4, 3};
        // .equals = 각 배열의 내용이 같은지 판별
        System.out.println(Arrays.equals(arr3, arr4));  // false
        System.out.println(Arrays.equals(arr3, arr5));  // true

        // .sort 와 .equals 를 활용한 예시
        Arrays.sort(arr4);
        Arrays.sort(arr5);
        System.out.println(Arrays.equals(arr4, arr5));

        // .binarySearch
        int[] arr6 = {5, 3, 8, 1, 6};
        Arrays.sort(arr6);
        int i = Arrays.binarySearch(arr6, 3);
        System.out.println(i);
        int i2 = Arrays.binarySearch(arr6, 4);
        System.out.println(i2);
        // .binarySearch 는 .sort로 배열을 정돈하지 않으면 음수로써 서치된다.
        // 찾는 숫자가 배열안에 없을시 음수로 처리되며 -1 이 더해져 서치된다.

    }
}
