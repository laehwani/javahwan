package project2.Class.Ch17stream.lecture;

import java.util.List;

public class C16reduce {
    public static void main(String[] args) {
        var list = List.of(3, 4, 1);

        Integer max = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max : "+ max);

        List<Integer> list2 = List.of();
        Integer max2 = list2.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max2 : "+ max2);

    }
}
