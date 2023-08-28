package Project;

import java.util.Scanner;

public class First_screen {

	void line() {
		System.out.println("-------------------");
	}
	void first_mode() {
		Scanner scan = new Scanner(System.in);
		
		line();
		System.out.println("멤버 리스트");
		line();
		System.out.println("1. 입 력 : ");
		System.out.println("2. 출 력 : ");
		System.out.println("3. 수 정 : ");
		System.out.println("4. 조 회");
		System.out.println("5. 저장하기");
		System.out.print("작업 번호를 선택 하세요 : ");
//		int no = scan.nextInt();
//		line();

		
	}
}
