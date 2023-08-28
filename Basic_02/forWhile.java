package Basic_02;

import java.util.Scanner;

public class forWhile {
	
	public static void main(String[] args) {

//		int a=0, b=0, c=0;
//		for(int i=1; i<=100; i++) {
//			a += i;
//			if( i%2==0 ) {
//				b += i;
//				
//			}else {
//				c += i;
//			}
//		}
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		Scanner scan = new Scanner(System.in);
//		int a ,b,c=0 ;
//		while(c<10) {
//			for (a=2; a<=9; a++) {
//				a= scan.nextInt();
//				for(b=1; b<=9; b++) {
//					System.out.println(a+" * "+b+" = "+(a*b));
//				}
//				System.out.println(a+"==========단 끝==========");
//				continue;		
//			}
//			System.out.println("1 ~ 9단까지만 구해주세요");
//			break;
//		}
		
//		int count=0;
//		while(count < 5) {
//			count++;
//			System.out.println("아직도 작네..."+ count);
//		}
//		int count=0;
//		while(count < 500) {
//			if(count>5) {
//				break;
//			}else {
//				count++;
//			}
//			System.out.println("아직도 작네..."+ count);
//		}
		
//		int count = 0;
//		while(true) {
//			if(count>5) {
//				break;
//			}
//			count++;			
//		}
//		System.out.println("아직도 작네..."+ count);
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			String a = scan.next();
			System.out.println("또 찍을꺼? (y/n)");
			
			if (a.equals("y")) {
				System.out.println("돌아가욧");
				continue;
			}else {
				System.out.println("그만해욧");
				break;
			}
		}
		
		
	}
}
