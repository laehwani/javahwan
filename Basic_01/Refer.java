package Basic_01;

import java.util.Scanner;


public class Refer {

	public static void main(String[] args) {
		
		int a= 1004;
//		Integer refA = new Integer(10);
		Integer refA = 1004;
		System.out.println( "값 : "+ a );
		System.out.println( "값 : "+ refA );
		
		String refS = refA.toString();
		System.out.println( "refS : "+ refS.length());
		
		Long refL = 5481231231L;
		String refK = refL.toString();
		System.out.println( "refK : "+ refK.length());
		
		System.out.println( "Integer.parseInt()를 "
				+ "사용하여 정수로 변환 후 출력 : "+ Integer.parseInt("65"));
		
	}

}
