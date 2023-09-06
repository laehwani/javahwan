package project2.Class.ch12api.book.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatchEx {
    public static void main(String[] args) {
        // 첫번째는 알파벳, 두번째부터 숫자와 알파벳, 8~12글자 사이, 대소문자 허용
        String id = "5Angel1004";     // 첫번째가 숫자라서 false
        String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
        boolean isMatch = id.matches(regExp);
        if (isMatch) {
            System.out.println("ID 로 사용할 수 있습니다");
        } else {
            System.out.println("ID 로 사용할 수 없습니다");
        }
    }
}
