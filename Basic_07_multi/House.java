package Basic_07_multi;

public class House {
	public static void main(String[] args) {
		Dan dan = new Dan();
		dan.door();
		System.out.println("-----------------------");
		
		Apt apt2 = new Dan();
		apt2.door();
		Apt apt1 = new Apt();
		apt1.door();
		
	}
}
class Apt{
	int room = 3;
	void door() {
		System.out.println("문이 열려욧");
		
	}
}
class Dan extends Apt{
	void door() {
		System.out.println("문을 도어락");	// 오버라이딩 : 처리 내용만 바꾼다. 
	}
}