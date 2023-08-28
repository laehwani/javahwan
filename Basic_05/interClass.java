package Basic_05;

public class interClass {

	static void sori(String sound) {	// 클래스 멤버함수
		System.out.printf("%s 의 특징", sound);
	}
	
	static class cat{		// 내부 클래스

		static String so= "야옹";  			//cat클래스 속성
		static void cat1(String name) { 	//cat클래스 메서드
			System.out.println("전달 받은 소리 : "+ name );
			
		}
	}

	
	public static void main(String[] args) {
		
		cat.cat1(cat.so);
		sori("소리를 찾아서");
		
		interClass tig1 = new interClass();
		System.out.println();
	}
	
}
