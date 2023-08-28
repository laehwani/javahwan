package Basic_01;
import static java.lang.System.out;

import java.util.Scanner;

public class Math_Bak {

	static void who() {
		System.out.println("넌 누구니");
	}
	static void iam(int no) {
		
		Scanner aa= new Scanner(System.in);
		String name;
		System.out.print("이름을 입력하세요 : ");
		name=aa.next();		
		System.out.println("번호 "+no+" :"+name);
	}

	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			
			who();
			iam(i+1);
		}
		System.out.println("출석 끝");
		
	}
	

}