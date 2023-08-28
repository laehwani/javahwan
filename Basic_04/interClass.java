package Basic_04;

public class interClass {

	static class cat{	// 내부 클래스
		static String so= "야옹";		// cat클래스의 변수
		static void cat_method(String name) {
			System.out.println("고양이 소리 : "+ so);
		}
	}
	static class tiger{		// 내부 클래스
		static String so= "어흥";
		static void tiger_method(String name, String name1) {
			name = "어흐흥";
			name1 = "어흐흐흐흥";
//			System.out.println("호랑이 소리 : "+ name);
			System.out.println("\n호랑이 소리는 "+ name +name1);
		}
	}
	static void sori(String sound) {	// interClass클래스의 메서드
		
	}
	
	public static void main(String[] args) {
		System.out.println("고양이 특징");
		tiger.tiger_method(null, null);
	
	}
}
