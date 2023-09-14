package project2.Class.ch11exception.book.sec07;

class NotExistIdException extends Exception {

    public NotExistIdException() {

    }

    public NotExistIdException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

public class LoginEx {

    public static void main(String[] args) {

        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            login("blue", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws Exception {
        // id가 blue가 아니라면 NotExistIdException 을 발생시킴
        if (!id.equals("blue")) {
            throw new NotExistIdException("아이디가 존재하지 않습니다");
        }
        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호가 틀립니다");
        }
    }
}
