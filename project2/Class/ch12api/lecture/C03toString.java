package project2.Class.ch12api.lecture;

public class C03toString {
    public static void main(String[] args) {
        Car car1 = new Car("테슬라", 5000);
        Car car2 = new Car("기아", 3000);
        Car car3 = new Car("현대", 4000);

        System.out.println(car1.getModel()+ " : "+car1.getModel());
        System.out.println(car2.getModel()+ " : "+car2.getModel());
        System.out.println(car3.getModel()+ " : "+car3.getModel());

        System.out.println(car1.toString());
    }
}
class Car {
    private String model;
    private int piece;

    public Car(String model, int piece) {
        this.model = model;
        this.piece = piece;
    }

    public String getModel() {
        return model;
    }

    public int getPiece() {
        return piece;
    }

//    @Override
//    public String toString() {
//        return this.model + " : "+ this.piece;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", piece=" + piece +
                '}';
    }
    // 객체를 설명하는 문자열 리턴
}


