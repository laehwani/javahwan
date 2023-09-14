package project2.Class.ch11exception.lecture;

public class C23custom {

    public static void main(String[] args) {
        int money = 300;

        if (money < 10000) {
            throw new LackOfMoneyException("돈이 필요햇");
        }
    }

}

