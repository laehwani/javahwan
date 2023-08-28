package Basic_06;

public class Overload {

	static void car() {
		System.out.println("자동차 소개");
	}
	static void car(int x) {
		System.out.println(x);
	}
	static void car(String s) {
		System.out.println(s);
	}
	static void car(int aab, int bba){
		System.out.println(aab+", "+bba);
	}
		
	
	public static void main(String[] args) {

		car();		// 메서드 호출
		car(500);
		car("제니시스");
		car(2023, 300);
	}

}
