package project2.Class.ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

    // 형변환에 대해....
public class C10instanceof {
    public static void main(String[] args) {
        // instanceof
        // 연산결과 : boolean
        // 좌변 : 참조변수
        // 우변 : 참조타입
        CharSequence c = "java";
        boolean r1 = c instanceof String;
        boolean r2 = c instanceof Serializable;
        boolean r3 = c instanceof Comparable;
        boolean r4 = c instanceof Constable;
        boolean r5 = c instanceof ConstantDesc;
        boolean r6 = c instanceof Object;
        boolean r7 = c instanceof CharSequence;





    }
}
