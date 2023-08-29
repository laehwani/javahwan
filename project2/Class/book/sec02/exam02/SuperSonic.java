package project2.Class.book.sec02.exam02;

public class SuperSonic extends Airplane{
    public static final int Normal = 1;
    public static final int SuperSonic = 2;
    // 상태 필드 선언
    public int flymode = Normal;

    public void fly(){
        if (flymode == SuperSonic) {
            System.out.println("초음속 비행합니다");
        }else{
            super.fly();
        }
    }
}
