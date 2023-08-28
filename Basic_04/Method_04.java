package Basic_04;

public class Method_04 {

	static String name = "넌 누구니? ";
	static String[] name_1 = {"난 첫째","난 둘째","난 셋째","난 넷째","난 다섯째"};
	
	static void nan() {
		for(int i=0; i<name_1.length; i++) {
			System.out.println((i+1)+"번 "+name+" : "+name_1[i]);
		}
		
	}

	String nam = "넌 누구니? ";
	String[] name_2 = {"난 첫째","난 둘째","난 셋째","난 넷째","난 다섯째"};
	void nanjang() {
		for(int o=0; o<name_2.length; o++) {
			System.out.println((o+1)+"번 "+nam+" : "+name_2[o]);
		}
	}
	
	
	public static void main(String[] args) {
		nan();
		System.out.println("-------------------");
		Method_04 nanjangE = new Method_04(); 
		nanjangE.nanjang();
	}

}
