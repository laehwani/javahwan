package homework.homework.practice.Arrays;

public class Arrays {
    public static void main(String[] args) {

    }
}


//class A {
//
//    Arrays : 배열을 다루기 편리한 메서드. 즉 배열 관련 메서드
//    1. 배열의 출력 - toString()
//        ex ) static String toString(기본형타입[] a);
//
//    2. 배열의 복사 - copyOf(), copyOfRange()
//        ex ) int[] arr = {0, 1, 2, 3, 4};
//            int[] arr2 = Arrays.copyOf(arr.length); // arr2 = [0,1,2,3,4]
//            int[] arr3 = Arrays.copyOf(arr, 3); // arr3 = [0,1,2]
//            int[] arr4 = Arrays.copyOf(arr, 7); // arr4 = [0,1,2,3,4,0,0]
//            int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr5 = [2,3]
//            int[] arr6 = Arrays.copyOf(arr, 0, 7); // arr4 = [0,1,2,3,4,0,0]
//
//    3. 배열 채우기 - fill(), setAll()
//        fill( ) = 배열을 지정리터널로 꽉 채운다.
//        setAll( ) = 배열을 람다식으로 채우는 것.
//        ex ) int[] arr = new int[5];
//            Arrays.fill(arr, 9)     // arr = [9,9,9,9,9]
//
//            Arrays.setAll(arr, (i) -> (int)(math.random)*5+1);  // arr = [1,3,1,5,2]
//
//    4. 배열의 정렬과 검색 - sort(), binarySearch()
//        sort() = 배열안의 데이터를 정렬한다.
//        binarySearch() = sort 로 정렬된 배열안에 리너털값의 인덱스위치를 찾기.
//        ex ) int[] arr = {3, 2, 0, 1, 4};
//            Arrays.sort(arr);      // 배열 arr 을 정렬한다.
//            print(Arrays.toString(arr));    // arr = [0,1,2,3,4]
//
//            int idx = Arrays.binarySearch(arr, 2);  // idx = 2
//        @@ binarySearch 메서드는 꼭 sort 로 배열을 정렬시킨 후에 써야 제대로 작동한다.
//
//    5. 다차원 배열의 출력 - deepToString()
//        ex ) int[][] arr2D = {{11,12,13},{21,22,23}};
//            print(Arrays.deepToString(arr2D));  // [[11,12,13],[21,22,23]]
//
//    6. 다차원 배열의 비교 - deepEquals()
//        : 일차원 배열은 .equals() 이고
//            다차원 배열은 deep 을 붙인 .deepEquals() 를 써야 작동한다.;
//
//    7. 배열을 List 로 변환 - asList(객체...a)
//
//        ex ) List list = Arrays.asList(new Integer[]{1,2,3,4,5});
//             List list = Arrays.asList(1,2,3,4,5);
//             // 위와 아래의 코드는 같다. 즉, 보다 읽기 쉬운 아래 코드를 쓰면 된다.
//             // 다만, 읽기 전용이기에 데이터 가공을 하면 에러가 난다.
//
