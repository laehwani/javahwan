package Basic_02;

import java.util.Scanner;
public class Else {

	public static void main(String[] args) {

//		Scanner scanf = new Scanner(System.in);
		
//		int a;
//		
//		a=scanf.nextInt();
//		if(a >= 90) {
//			System.out.println("A학점");
//		}else if(a >= 80){
//			System.out.println("B학점");
//		}else if(a >= 70){
//			System.out.println("C학점");
//		}else {
//			System.out.println("퇴학입니다");
//		}
		
		
//		
//		for(int i = 1; i <= 6; i++) {
//			int num = (int)(Math.random()*45)+1;
//			System.out.println(num);
//		}
//		switch(no){
//		}  스위치문을 이용한 랜덤숫자 뽑기
		
		// 정수를 입력하는데 1 ~ 3 사이의 숫자를 입력하라
		
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//			
//			switch(num) {
//			case 1 : System.out.println("초보");break;
//			case 2 : System.out.println("중급");break;
//			case 3 : System.out.println("고급");break;
//			default : System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
//			
//			}
		
		// 점수를 입력받아서 90 점 이상은 최우수, 80 점 이상은 우수, 
			
//		int num = scan.nextInt();
//		int su= num/10;
//		
//			switch(su) {
//			
//			case 10: System.out.println("최우수");break;
//			case 9: System.out.println("우수");break;
//			case 8: System.out.println("평범");break;
//			case 7: System.out.println("노력");break;
//			default: System.out.println("퇴학");
//		
//			}
			
		// 숫자를 입력 받아서 짝수이면 짝짝짝 박수, 홀수이면 홀홀홀 출력을 스위치 이용해서
			
//		int num = scan.nextInt();
//		switch(num%2) {
//		
//		case 0 : System.out.println("쨖쨖쨖 박수");break;
//		case 1 : System.out.println("홀홀홀");break;
//		}
		
		char c = 'b';
		
		switch(c) {
		case 'a' : System.out.println("A 클래스로 들어가시오"); break;
		case 'b' : System.out.println("B 클래스로 들어가시오"); break;
		case 'c' : System.out.println("C 클래스로 들어가시오"); break;
		case 'd' : System.out.println("D 클래스로 들어가시오"); break;
		case 'e' : System.out.println("F 클래스로 들어가시오"); break;
		
		}
	}

}
