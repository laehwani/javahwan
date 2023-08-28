package Basic_02;

import java.util.Scanner;

public class Switch {
	
	static void input_screen() {
		System.out.println("입력 화면 입니다");
	}
	static void search_screen() {
		System.out.println("조회 화면 입니다");
	}

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		int a;
		String result;
		
		System.out.println("화면 설계");
		System.out.println("\n작업 내용");
		System.out.println("1. 입력");
		System.out.println("2. 조회");
		System.out.println("3. 수정");
		System.out.println("4. 출력");
		System.out.println("5. 종료");
		System.out.println("작업 번호를 누르세요.");
		
		a= scanf.nextInt();		
		switch(a) {
			case 1: {input_screen();}break;
			case 2: {search_screen();}break;
			case 3: {System.out.println();}
			case 4: {System.out.println();}
			case 5: {System.out.println();}
		
		
		
		}
		

	}
}
