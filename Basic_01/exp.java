package Basic_01;

import java.util.Scanner;

public class exp {

	
	public static void main(String[] args) {

		Scanner aa= new Scanner(System.in);
		
		System.out.println("정수를 입력해 주세요 : ");
		int n=aa.nextInt();		
		System.out.printf("입력하신 숫자는 %d 입니다\n",n);
		
		System.out.println("실수를 입력해 주세요 : ");
		Double s=aa.nextDouble();
		System.out.printf("입력하신 실수는 %f 입니다\n",s);
		
		System.out.print("단어를 입력하세요 : ");
		String str=aa.next();
		System.out.printf("입력하신 단어는 %s 입니다\n",str);

		aa.nextLine();
		System.out.print("문장을 입력하세요 : ");
		String p=aa.nextLine();
		System.out.printf("입력하신 문장은 %s 입니다\n",p);
		
		System.out.printf(" 입력하신 정수는 \"%d\"\n 입력하신 실수는 \"%.3f\"\n 입력하신 단어는 \"%s\"\n 입력하신 문장은 \"%s\" 입니다", n, s, str, p);
		
		
		
	}

}
