package project2.Class.ch08interface.book.exercise.exam07;

public class MysqlDao implements DataAccessObject{

    @Override
    public void select() {
        System.out.println("mysql 디비에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("mysql 디비에서 삽입");
    }

    @Override
    public void update() {
        System.out.println("mysql 디비에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("mysql 디비에서 삭제");
    }
}

