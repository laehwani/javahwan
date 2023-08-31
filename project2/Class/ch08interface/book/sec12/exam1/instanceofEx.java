package project2.Class.ch08interface.book.sec12.exam1;

public class instanceofEx {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        ride(taxi);
        System.out.println();
        ride(bus);
    }
    public static void ride(Vehicle vehicle){
        if (vehicle instanceof Bus bus) {
            bus.check();
        }
        vehicle.run();
    }
}
