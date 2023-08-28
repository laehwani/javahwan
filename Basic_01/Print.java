package Basic_01;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);
		
		System.out.println("메뉴 선택 프로그램");
		System.out.println("1. 새우 햄버거");
		System.out.println("2. 불고기 햄버거");
		System.out.println("3. 종료");
		System.out.println("주문번호를 입력하세요 : ");
		
		String menu;
		menu=scanf.next();
		
		while(true) {
			if(menu=="1"){
				System.out.println("새우 햄버거를 조리하겠습니다.");
				
			}else {
				System.out.println("불고기 햄버거를 조리하겠습니다.");
				
			}if(menu=="3") {
				
			}
			break;	
			
		}
		System.out.println("종료합니다.");

	}

}
