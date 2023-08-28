package Basic_02;
import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a;

		while(true) {
		System.out.println("화면 설계");
		System.out.println("\n작업 내용");
		System.out.println("1. 입력");
		System.out.println("2. 조회");
		System.out.println("3. 수정");
		System.out.println("4. 출력");
		System.out.println("5. 종료");
		System.out.println("작업 번호를 누르세요.");
		
			
			a= scanf.nextInt();
			if(a==1) {
				System.out.println("입력 화면 입니다");
			}else if(a==2) {
				System.out.println("조회 화면 입니다");
			}else if(a==3) {
				System.out.println("수정 화면 입니다");
			}else if(a==4) {
				System.out.println("출력 화면 입니다");
			}else if(a==5) {
				System.out.println("시스템을 종료합니다");
				break;
			}else {
			}
			System.out.println("다시 입력하시겠습니까?");
			String result = scanf.next();
			if(result.equals("네")) {
				continue;
			}else {
			    System.out.println("시스템을 종료합니다.");
				break;
			} 
		
		
		}
		
	}

}
