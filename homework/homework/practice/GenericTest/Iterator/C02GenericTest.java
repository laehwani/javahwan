package homework.homework.practice.GenericTest.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private String name = "";
    private int ban;
    private int no;

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
public class C02GenericTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("화니", 2, 7));
        list.add(new Student("현", 3, 8));
        list.add(new Student("솜", 4, 9));

        Iterator<Student> stu = list.iterator();

        while (stu.hasNext()){
//            Student s = stu.next();
//            System.out.println(s.getName());
            // 위에 두 줄을 합쳐서 코드를 더 줄이면?
            System.out.println(stu.next().getName());
        }
    }
}
