package Reference;

public class C11method {

	public static void main(String[] args) {
		int[]a = num1();
		System.out.println(System.identityHashCode(a));
	}
	public static int[] num1() {
		int[]c = {9,7,5};
		
		System.out.println("num1 내부");
		System.out.println(System.identityHashCode(c));
		
		return c;
	}
}
