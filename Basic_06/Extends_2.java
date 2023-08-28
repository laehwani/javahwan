package Basic_06;

class Hong extends Extends_2{
	Hong( int age, String b ){
		super( age, b);		
		System.out.println("나는 자식 생성자");
		System.out.println("나는"+age+b);
	}
}
class Extends_2 {

	public static void main(String[] args) {
		
		Hong ab = new Hong(10,"b");	
		ab.pr(10,"홍길동");
	}

	int age = 50;
	String name = "부 모";
	
	Extends_2(int a,String b){
	
	}
	
	void pr(int a, String b) {
		System.out.println("3자식 : "+age + name);
	}
	
}

