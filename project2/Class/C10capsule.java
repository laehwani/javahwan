package project2.Class;

public class C10capsule {
    // 필드를 만들 때 별 일 없으면 private 을 붙이도록 한다.
    // 관련된 메소드를 주로 get, set 으로 public 을 자동완성 작성.
    private int age;
    private String name;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
