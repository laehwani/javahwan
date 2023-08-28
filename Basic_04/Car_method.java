package Basic_04;

public class Car_method {
	
//	String handle= "우회전";
//	int ball = 10;
//	int rotate = 20;
//	
//	void car_run() {
//		handle = "90도 회전";
//		ball = 40;
//		System.out.printf("1번 코너에서 %s 하세요", handle );
//		if (ball < 10)
//			System.out.printf("1번 코너에서 %d 하세여", rotate);
//		else
//			System.out.printf("1번 코너에서 %d 하세여", rotate+50);
//	}
//	
//	public static void main(String[] args) {
//
//		Car_method car = new Car_method();
//		car.car_run();
//	}
		static String food = "김치";	// 클래스 멤버 변수
		static void menu_1() {			// 클래스 멤버 함수
			System.out.printf("나는 %s 입니다.", food);  
		}
		
		String food2 = "불고기";			// 인스턴스 멤버 변수
		void menu_2() {				// 인스턴스 멤버 함수
			System.out.printf("나는 %s 입니다", food2);
		}
		
		public static void main(String[] args) {
			System.out.println("반찬 출력 : " + food);
			menu_1();
			
			Car_method bab = new Car_method();
			System.out.println("\n메인 반찬 출력 : " + bab.food2);
			bab.menu_2();
		

	}

}
