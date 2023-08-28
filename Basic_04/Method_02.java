package Basic_04;

public class Method_02 {

	static String[] name_1= {"홍길동", "김다솜", "김도현"};
	static String[] job= {"망나니", "망나니1", "망나니2"};
	static int[] age= {20, 30, 40};
	static void posi() {
		System.out.println(name_1[2]);
		System.out.println(job[2]);
		System.out.println(age[0]);		
	}
	void posi2() {
		String[] name_1= {"홍길동", "김다솜", "김도현"};
		String[] job= {"망나니", "망나니1", "망나니2"};
		int[] age= {20, 30, 40};
		
		for(int i=0; i<age.length; i++) {
			for(i=0; i<name_1.length; i++) {
				for(i=0; i<job.length; i++) {
					System.out.println("["+name_1[i]+job[i]+"] 나이는 : "+ age[i]);
			}
		}
	}
}	
	public static void main(String[] args) {
		posi();
		
		Method_02 som = new Method_02();
		som.posi2();
	}
}
