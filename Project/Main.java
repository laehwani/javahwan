package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		First_screen scr = new First_screen();
		scr.first_mode();
		Input_screen inp = new Input_screen();
		
		int no = scan.nextInt();
		if (no == 1) {
			inp.input_mode();
		}
		scan.close();
	}

}
//1. 입력 input_screen
//2. 수정 edit_screen
//3. 출력 print_screen
//4.  search_screen
//5. 수정 end_screen
//작업 버튼 : Jakup_btn

//1. 입력 화면
//
//1. 이름  input_nameA
//2. 전화  tel_nameA
//3. 성별  sung_nameA
//4. 저장 하시겠습니까? y/n