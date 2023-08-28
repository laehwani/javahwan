package Basic_05;


public class interTra {

	static String title;
	static int speed = 100;
	
	static void run() {
		System.out.println("달리다 ");
	}
	static void tra_run() {
		System.out.println("부모에서 달리는 메소드"+ speed);
	}
	
	static class Bus{
	
		static int speed= 30;
		static void bus_run() {
			System.out.println("버스 속도 : "+ speed);
			System.out.println("부모 속도 : "+ interTra.speed);
			interTra.run();
		}

	}
	public static void main(String[] args) {
		
		run();
		tra_run();
		
		Bus.bus_run();
			

	}

}
