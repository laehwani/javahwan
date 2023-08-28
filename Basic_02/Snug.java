package Basic_02;

import java.util.Scanner;

public class Snug {

	public static void main(String[] args) {

		Scanner scanf= new Scanner(System.in);

		int kor, mat, eng, sum;
		double avg;
		String hap, hak;
		while(true) {
			
		System.out.print("국어 : ");
		kor = scanf.nextInt();
		System.out.print("\n수학 : ");
		mat = scanf.nextInt();
		System.out.print("\n영어 : ");
		eng = scanf.nextInt();
		
		sum = kor+ mat+ eng;
		avg = sum/3;
		hap = avg>=60 ? "합격" : " 불합격";
		System.out.printf("\n총점은 %d점 입니다",sum);
		System.out.printf("\n"
				+ "3과목의 평균점수는 %.0f점 입니다",avg);
		System.out.printf("\n합격여부 : %s"+"\n", hap);
	
		if(avg > 90) {
		System.out.println("회원님의 점수는 A.");
		}else if(avg > 80){
			System.out.println("회원님의 점수는 B.");			
		}else if(avg > 70){
			System.out.println("회원님의 점수는 C.");			
		}else if(avg > 60){
			System.out.println("회원님의 점수는 D.");			
		}else {
			System.out.println("회원님의 점수는 F.");
		}
		
		System.out.println("또 하실건가요 y/n");
		String result = scanf.next();
		if(result.equals("y")) {
			System.out.println("예 다시 입력합니다.");
			continue;
		}else {
			System.out.println("종료합니다");
			break;
		}
		}
		
	}
}
