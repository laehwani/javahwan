package project2.Class.ch08interface.book.exercise.exam07;

public class DaoEx{
    public static void dbwork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbwork(new OracleDao());
        dbwork(new MysqlDao());
    }
}

