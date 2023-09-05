package project2.Class.ch16lambda.book.sec05.exam3;

public class finalEx {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1(Member::new);
        System.out.println(m1);
        System.out.println();
        Member m2 = person.getMember2(Member::new);
        System.out.println(m2);
        System.out.println();
    }
}
