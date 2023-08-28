package Basic_03;
import java.util.Scanner;
public class Array_01 {

	public static void main(String[] args) {
//		
//		String[] exp = {"dasom", "hwani", "hyun"};
//		System.out.println(exp[0]);
//		System.out.println(exp[1]);
//		System.out.println(exp[2]);
//		
//		System.out.println("------------------");
//		for (int i=0; i<3; i++) {
//			System.out.println(exp[i]);
//		}
//		
//		System.out.println("------------------");
//		exp[2]="다혜";
//		for (int i=0; i<exp.length; i++) {
//			System.out.println(i + " : " + exp[i]);
//		}
		int i;
		String[] weak = {"월","화","수","목","금","토","일"};
		
		for( i=0; i < weak.length; i++) {
			System.out.println(i + " : " + weak[i]);
		}
		
		int [] su = { 10, 20, 30 ,40 , 50};
		int sum=0;
		su[4]=87;
			for( i=0; i < su.length; i++) {
				sum += su[i];
				System.out.println( su[i] );
			}
			System.out.println("총 합계는 : "+ sum);
			System.out.println("평균 점수는 : "+ sum/5);
			
		String [] ju = { "홍길동", "래환", "다솜", "현", "영"};
		String [] ph = { "011", "012", "013", "014", "015"};
		int [] age = { 10, 20, 30, 40, 50};
			for( i=0; i<ph.length; i++) {
//				System.out.print(ju[i]+" ");
//				System.out.print("번호는 : "+ph[i]+"\n");
//				System.out.println("나이는 : "+age[i]);
				System.out.printf("%d %s %s %d\n", (i+1), ju[i], ph[i], age[i]);
			}
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 개의 점수를 입력 할건가요?");
		int [] jumsu = new int [scan.nextInt()];
		int sum1=0;
		for ( i=0; i<jumsu.length; i++) {
			System.out.print("점수 입력 : ");
			jumsu[i] = scan.nextInt();
			sum1 += jumsu[i];
	
		}
		int avg = sum1/jumsu.length;
		System.out.println("입력된 점수의 총 합은 : "+ sum1);
		System.out.printf("이 반의 학생 수는 %d 명이고, 평균점수는 %d 입니다",i ,avg);
	}

}
