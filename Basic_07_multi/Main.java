package Basic_07_multi;

public class Main {

	public static void main(String[] args) {
		
		Car bus = new Bus();
		bus.run();
		bus.run2();
		Car tru = new Tru();
		tru.run();
		Bus bus2 = new Bus();
		bus2.run2();
	
	}

}
class Car{
	String[] name = { "버스에욧", "트럭이에욧" };
	int[] speed = { 150, 200 };
	String run = "달려욧!!!";
	void run() {
		System.out.println("달려욧");
	}
	void run2() {
	}
	
}
class Bus extends Car{
	void run() {
		System.out.printf("차종은 %s , 최고시속은 %dkm이에욧!! %s%n", name[0],speed[0],run);
	}
	void run2() {
		System.out.println("오늘도 달려욧!!!");
	}
}
class Tru extends Car{
	void run1() {
		System.out.printf("차종은 %s , 최고시속은 %dkm이에욧!! %s%n", name[1],speed[1],run);
	
	}
}