package project2.Class.ch08interface.lecture;

import java.nio.CharBuffer;
    // 리턴문에 대해...
public class C07return {
    public static void main(String[] args) {

        for (int i=0; i< 10; i++) {
            CharSequence charSequence = getCharSequence();
            System.out.println(charSequence);
        }
    }

    public static CharSequence getCharSequence() {

        double d = Math.random();
        if (d < 0.33) {
            return new String("java");
        } else if (d < 0.66) {
            return new StringBuffer("spring");
        } else {
            return new StringBuilder("help");
        }
    }
}
