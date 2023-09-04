package project2.Class.ch16lambda.book.sec05.exam02;

public class ReferenceEx {
    public static void main(String[] args) {
        Person person = new Person();

        person.order(String::compareToIgnoreCase);
    }
}
