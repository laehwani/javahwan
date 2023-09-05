package project2.Class.ch12api.book.sec3.exam02;

public class HashcodeEx {
    public static void main(String[] args) {
        Student s1 = new Student(1,"화니");
        Student s2 = new Student(1, "화니");
        Student s3 = new Student(2, "화니");

        if (s1.hashCode() == s2.hashCode()) {
            // 해쉬코드가 동일한지 비교검사
            if (s1.equals(s2)) {
                // 데이터가 동일한지 비교검사
                System.out.println("동등 객체 입니다");
            }else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        }else{
            System.out.println("해쉬코드가 다르므로 동등 객체가 아닙니다.");
        }
    }
}
