package Project;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input_screen extends First_screen {
	
	String name;
	String snug;
	int age;
	int su_num;
	
	static String[] nameA = new String[3];
	static String[] snugA = new String[3];
	static int[] ageA = new int[3];
	
	static int count= 0;
	
//	String[] input_nameA = {"피카츄","라이츄","파이리","꼬부기","버터플","야도란","리자드","이상해"};
//	String[] snug_nameA = {"남 자","여 자","남 자","여 자","여 자","여 자","여 자","남 자"};
//	int[] age_nameA = {10, 11, 12, 13, 14, 15, 16, 17};
	
	Scanner scan = new Scanner(System.in);
	
	void input_name() {
		System.out.print("1. 이 름 : ");
		name = scan.next();
	}
	void input_sung() {
		System.out.print("2. 성 별 : ");
		snug = scan.next();
	}
	void input_age() {
		System.out.print("3. 나 이 : ");
		age = scan.nextInt();
	}
	void input_mode() {
		
		
//		while(true) {
//			String str1 = JOptionPane.showInputDialog(null,"ID를 입력하세요");
//			System.out.printf("찾는 사람 이름 : %s\n", str1);
//		}
		System.out.println("입력 화면");
		input_name();
		input_sung();
		input_age();
		
		System.out.println("4. 수정할 번호");
		su_num = scan.nextInt();
		
		System.out.println("5. 저장하기");
		System.out.println("작업 번호를 선택 하세요 : ");
		
		if(su_num == 1) {
			input_name();
		}else if(su_num == 2) {
			input_sung();
		}else if(su_num == 3) {
			input_age();
		}else if(su_num == 5) {
			nameA[count]= name;
			snugA[count]= snug;
			ageA[count]= age;
			System.out.println(nameA[count]+ ", "+ snugA[count]+ ", "+ageA[count]);
		}
		
		
	}
}
