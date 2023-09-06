package project2.Class.ch12api.book.sec3.exam02;

import java.util.Arrays;
import java.util.Objects;

public class C25arrays {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 5, 9, 7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Student01[] arr2= {
                new Student01("이강인"),
                new Student01("손흥민"),
                new Student01("김민재")};

//        Arrays.sort(arr2,(x,y)->x.getName().compareTo(y.getName()));
        System.out.println(Arrays.toString(arr2));
    }

}

class Student01 {
    private String name;

    public Student01(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                '}';
    }
}
