package project2.Class.book.exercise.p08;

public class SnowTireEx {
    public static void main(String[] args) {
        SnowTire snowtire = new SnowTire();
        Tire tire = snowtire;

        tire.run();
        snowtire.run();
    }
}
