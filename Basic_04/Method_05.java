package Basic_04;


public class Method_05 {

	static String name= "김다솜김도현";
	static int count=0;

	static class Who{
		static void who() {
			System.out.println("\n멍충이");
		}
	}
	static class Iam{
		static void iam() {
			System.out.printf("난 %d번째 난장이야", ++count);
		}
	}

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			Who.who();
			Iam.iam();
		}

	}
}
