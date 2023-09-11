package homework.homework.practice.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class C01main {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(10);
        // 원래 ArrayList 에는 객체만 저장가능하다.
        // 하지만 오토박싱에 의해 기본형은 참조형으로 자종 변환이 가능하다.
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);

        // subList
        ArrayList list2 = new ArrayList((list1.subList(1,3)));
        System.out.println(list1);
        System.out.println(list2);

        // Collections.sort : 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        list2.add("B");
        list2.add("C");
        list2.add(2, "A");
        System.out.println(list1);
        System.out.println(list2);

        list2.set(3, "AAA");
        list1.set(4, "111");
        System.out.println(list1);
        System.out.println(list2);

        list1.add(0, 5);
        System.out.println(list1);
        System.out.println("index = "+ list1.indexOf(1));
        // indexOf( ) 는 지정된 객체의 인덱스를 알려준다.

        list1.remove(3);
        list2.remove(3);
        System.out.println(list1);
        System.out.println(list2);

        // contains 를 이용한 list2 에서 list1에 포함된 객체 삭제
        for (int i = list2.size()-1; i>= 0; i++) {
            if(list1.contains((list2.get(i))))
                list2.remove(0);
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
