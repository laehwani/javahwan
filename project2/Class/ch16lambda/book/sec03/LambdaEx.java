package project2.Class.ch16lambda.book.sec03;

public class LambdaEx {
    public static void main(String[] args) {
        Person person = new Person();

        person.action01((name, job) -> {
            System.out.println("이름 : "+name+", 직업은 : "+job);
        });

        person.action02(speak-> System.out.println(speak));


    }
}