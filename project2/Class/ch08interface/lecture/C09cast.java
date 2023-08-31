package project2.Class.ch08interface.lecture;

import java.io.Console;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.lang.constant.ConstantDescs;

    // 형변환에 대해...
public class C09cast {
    public static void main(String[] args) {
        CharSequence a = "java";
        String s = (String) a;  // OK
        Object o = (Object) a;  // OK
        Serializable d = (Serializable) a;
        Comparable co = (Comparable) a;
        Constable con = (Constable) a;
        ConstantDesc cons = (ConstantDesc) a;

//        Number n = (Number) a;
        // 넘버는 스트링의 변환가능타입이 아니기 때문에 문법적 오류는 없지만 에러가 난다.

        System.out.println("시스템종료");
    }
}
