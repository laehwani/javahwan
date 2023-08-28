package Basic_01;

public class Cast {

	int a= 0;
	byte b= (byte)a;
	long kbs= 10;
	double sbs= 3.1*10;

	void pri() {
		System.out.printf("long 형에 정수 입력 : %d", kbs);
		System.out.printf("\ndouble형에 정수 곱하기 입력 : %f", sbs);
		System.out.printf("\n4바이트 int형이 1바이트(-128~127)에 강제 변환 : %d",b);
	}
	
	public static void main(String[] args) {
		
		Cast cast = new Cast();  // 부모(자신) 클래스에서 객체 생성했다.
		cast.pri();
		
		long kbs= 10;
//		int a= 1000;
//		byte b= (byte)a; //형변환을 하기 위해선 변환하려는 데이터타입=(변환하는 타입) 이렇게 지정해줘야한다.
//		System.out.printf("\n4바이트 int형이 1바이트(-128~127)에 강제 변환 : %d",b);
		
	}

}
