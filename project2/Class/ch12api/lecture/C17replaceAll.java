package project2.Class.ch12api.lecture;

public class C17replaceAll {
    public static void main(String[] args) {
        // replace 는 소문자 대문자를 구별해야만 한다.
        String a = "JAVA is java";
        String r = a.replace("java", "python");
        System.out.println(r);  // = JAVA is python

        // replaceAll : 특정 패턴 - > 다른 문자열로 변경
        String r2 = a.replaceAll("(java|JAVA)", "python");
        System.out.println(r2);  // = python is python
    }
}
