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

        // 문자 분류 (Charactor classes)
        System.out.println("dog".matches("d[oi]g"));   // true
        System.out.println("dig".matches("d[oi]g"));   // true
        System.out.println("dag".matches("d[oi]g"));   // false
        // d 와 g 사이에 o 거나 i 거나

        // 문자 분류 2
        System.out.println("dog".matches("d[^oi]g"));   // false
        System.out.println("dig".matches("d[^oi]g"));   // false
        System.out.println("dag".matches("d[^oi]g"));   // true
        // d 와 g 사이에 o 나 i 가 들어가면 안된다

        System.out.println("dag".matches("d[a-x]g"));   // true
        System.out.println("dbg".matches("d[a-x]g"));   // true
        System.out.println("dcg".matches("d[a-x]g"));   // true
        System.out.println("dzg".matches("d[a-x]g"));   // false
        // d 와 g 사이에 a 부터 x 까지 아무거나 들어가도 된다

        System.out.println("dag".matches("d[a-cx-z]g"));    // true
        System.out.println("dbg".matches("d[a-cx-z]g"));    // true
        System.out.println("dcg".matches("d[a-cx-z]g"));    // true
        System.out.println("ddg".matches("d[a-cx-z]g"));    // false
        System.out.println("dzg".matches("d[a-cx-z]g"));    // true
        // d 와 g 사이에 a 부터 c , 또는 x 부터 z 까지 아무거나 들어가도 된다

        // 문자 분류 기호
        System.out.println("0".matches("[0-9]"));   // true
        System.out.println("7".matches("[0-9]"));   // true
        System.out.println("0".matches("\\d"));     // true
        System.out.println("7".matches("\\d"));     // true
        // 같은 뜻이지만 " " 안에 \(역슬래시) 를 쓸꺼면 두번을 써야 적용된다.

        System.out.println("a".matches("[a-zA-Z_0-9]"));    // true
        System.out.println("_".matches("\\w"));     // true
        System.out.println("8".matches("\\w"));     // true
        System.out.println("10".matches("\\w"));    // false

        // 예제 : 숫자로 시작하면 안되고, 영문 대소문자, _, $
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern)); // true
        System.out.println("_".matches(pattern));       // true
        System.out.println("$".matches(pattern));       // true
        System.out.println("4".matches(pattern));       // false

        // 예제 : 전화번호 패턴
        // 010-9999-9999
        // 02-9999-9999
        // 02-999-9999
        // 01099999999
        // 0212345678
        // 021234678
        String pattern2 = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("010-9999-9999".matches(pattern2));
        System.out.println("02-9999-9999".matches(pattern2));
        System.out.println("02-999-9999".matches(pattern2));
        System.out.println("01099999999".matches(pattern2));
        System.out.println("0212345678".matches(pattern2));
        System.out.println("021234678".matches(pattern2));

    }
}
