package Basic_01;

import java.util.Scanner;

public class Samhang {
	
	void su_func(){
	//두 수를 입력 받아서	 큰 수를 찾아내는 프로그램을 작성하라.
	int num, num1;
	while(true) {
		
	
	Scanner scanf = new Scanner(System.in);
	System.out.print("첫 번째 입력 숫자 : ");
	num= scanf.nextInt();
	
	System.out.print("두 번째 입력 숫자 : ");
	num1= scanf.nextInt();
	
	String result;
	result = num>num1 ? num+"이 "+num1+" 보다 크다" : num+"이 "+num1+" 보다 작다";
	result = num<num1 ? "num1<num2" : "num1>num2";

	System.out.println(result);
	
	System.out.println("또 하실건가요(y/n) : ");
	String yn = scanf.next();
	if(yn.equals("y")) {
		System.out.println("다시 합니다.");
		continue;
	}
	else {
		System.out.println("끝났습니다.");
		break;
	}
	}
	
//	if(num > num1) {
//		System.out.println("첫 번째 숫자가 더 큽니다.");
//	}
//	else if(num < num1){
//		System.out.println("두 번째 숫자가 더 큽니다.");		}
//	else {
//		System.out.printf("%d 숫자와 %d 숫자는 같다", num,num1);
////		System.out.println();
//	}
	}
	public static void main(String[] args) {
		
		
		
		Samhang sam = new Samhang();
		sam.su_func();
		
		
		}
		

}
