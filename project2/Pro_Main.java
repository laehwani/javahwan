package project2;


import java.util.Random;
import java.util.Scanner;

public class Pro_Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("홀짝 게임");
		
		int ans= 0, in = 0;

			
			
			if(in%2==0) {
				ans=2;
			}else if(in%2==1) {
				ans=1;
			}
			while(true) {
				
				in = (int)(Math.random()*45)+1;
				
				System.out.println(in);
				System.out.print("홀(1) 짝(2) :");
				int me=scan.nextInt();
				if(ans==me) {
					System.out.println("정답입니다!");
				}else if(ans!=me) {
					System.out.println("틀렸습니다");
					
				
			}	
		}
		
	}
}
