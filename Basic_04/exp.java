package Basic_04;

public class exp {

	static class Car{
		String company= "현대자동차";
		String model;
		String color;
		int maxspeed;
		
		Car(String model, String color, int maxspeed){
			this.model = model;
			this.color = color;
			this.maxspeed = maxspeed;
		}
//		Car(String model){
//			this(model, "은색", 250);
//		}
//		Car(String model, String color){
//			this(model, color, 250);
//		}
		
	}
	public static void main(String[] args) {
		
		Car car1 = new Car("자가용","빨강",200);
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxspeed : " + car1.maxspeed);
	
		System.out.println("--------------------------------");
		
		Car car2 = new Car("스포츠카","노랑",400);
		System.out.println("car1.company : " + car2.company);
		System.out.println("car1.model : " + car2.model);
		System.out.println("car1.color : " + car2.color);
		System.out.println("car1.maxspeed : " + car2.maxspeed);
		
	}

}
