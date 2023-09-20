package project2.Class.ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation29
public class C29annotation {

    @MyAnnotation29
    public static void main(String[] args) {

    }
}

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.TYPE})
@interface MyAnnotation29 {

}
