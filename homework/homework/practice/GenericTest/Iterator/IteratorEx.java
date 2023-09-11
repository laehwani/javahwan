package homework.homework.practice.GenericTest.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String >();
        name.add("환");
        name.add("현");
        name.add("솜");

        Iterator<String> iterator = name.iterator();

        while (iterator.hasNext()){
            String name1 = iterator.next();
            System.out.println(name1);
        }
    }
}
