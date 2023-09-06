package project2.Class.ch12api.lecture;

public class C18regax {
    public static void main(String[] args) {
        // regular expression : 정규식 표현
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x"));   // true
        System.out.println("a".matches("a"));   // true
        System.out.println("a".matches("x"));   // false

        // 문자들
        System.out.println("xyz".matches("xyz"));   // true
        System.out.println("xxx".matches("xxx"));   // true
        System.out.println("xxx".matches("x")); // false

        // 수량자 (quantifiers)
        System.out.println("xxx".matches("x{3}"));  // true
        System.out.println("aaa".matches("a{3}"));  // true
        System.out.println("aa".matches("a{3}"));  // false
        System.out.println("aaa".matches("a{1,3}"));  // true
        // a 가 한번 나와도 되고 3번 나와도 된다는 뜻

        System.out.println("dog".matches("do{1,3}g"));   // true
        System.out.println("dooog".matches("do{1,3}g")); // true
        System.out.println("doog".matches("do{1,3}g"));  // true

        System.out.println("dodog".matches("do{1,3}g"));  // false

        // 그룹 : (내용) 으로 묶인 단어의 개수를 묻는 것.
        System.out.println("dodog".matches("(do){1,3}g"));   // true
        System.out.println("dododog".matches("(do){1,3}g")); // true
        System.out.println("dog".matches("(do){1,3}g"));     // true

        // 수량 : 몇개 이상인지를 묻는 것
        System.out.println("dog".matches("do{1,}g"));        // true
        System.out.println("dooooog".matches("do{1,}g"));    // true
        System.out.println("dooog".matches("do{1,}g"));      // true
        System.out.println("dooooooog".matches("do{1,}g"));  // true

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g"));       // true
        System.out.println("dog".matches("do?g"));      // true
        System.out.println("dooog".matches("do?g"));    // false

        // * : 0번 이상
        System.out.println("dg".matches("do*g"));        // true
        System.out.println("doooog".matches("do*g"));    // true
        System.out.println("doog".matches("do*g"));      // true
        System.out.println("doooooog".matches("do*g"));  // true

        // + : 1번 이상
        System.out.println("dg".matches("do+g"));       // false
        System.out.println("doooog".matches("do+g"));       // true
        System.out.println("doog".matches("do+g"));       // true


    }
}
