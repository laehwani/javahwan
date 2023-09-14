package project2.Class.ch11exception.book.sec02.exam01;


public class ExceptionEx {

    public static void length(String data) {

        try {
            int result = data.length();
            // data 가 null 일 경우 nullpointerException 발생
            System.out.println("문자 수 : " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();
            // 예외 정보를 얻는 3가지 방법
        } finally {
            System.out.println("[마무리 실행]");
        }

    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        length("ThisisJava");
        length(null);
        System.out.println("[프로그램 종료]");
    }
}


