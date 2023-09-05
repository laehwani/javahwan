package project2.Class.ch12api.lecture;

    // length 와 text block 문구에 대해서.
public class C11string {
    public static void main(String[] args) {
        // length : 길이
        String a = "java";
        String b = "spring";
        String c = "hello world";
        String d = "Hello   ";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        System.out.println(d.length());

        // text block
        // 기준은 가장 왼쪽 들여쓰기 부터 시작.
        String e = """
                hello world
                hi java
                greeting spring
                """;

        System.out.println(e.length());

    }

}