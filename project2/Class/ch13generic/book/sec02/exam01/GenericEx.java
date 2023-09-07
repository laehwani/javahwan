package project2.Class.ch13generic.book.sec02.exam01;

public class GenericEx {
    public static void main(String[] args) {
        Product<Tv, String> p1 = new Product<>();

        p1.setKind(new Tv());
        p1.setModel("스마트모델");

        Tv tv = p1.getKind();
        String tvModel = p1.getModel();
        System.out.println(tvModel);


        Product<Car, String> p2 = new Product<>();

        p2.setKind(new Car());
        p2.setModel("트블");

        Car car = p2.getKind();
        String carModel = p2.getModel();
        System.out.println(carModel);
    }
}
