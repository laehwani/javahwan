package Basic_07_multi;

import java.util.Scanner;

import Basic_06.Car_1;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Car1 bus = new Bus1();
		Car1 tru = new Tru1();

		while(true) {

			System.out.print("1. 일반 버스 \n2. 고속 버스 \n3. 종료\n선택하세요 : ");
			int input = scan.nextInt();
			if(input == 1) {
				bus.run();
				bus.run1();
				bus.run2();
				
			}else if(input == 2) {
				tru.run();			
				tru.run1();
				tru.run2();
				
			}else if(input == 3){
				System.out.println("종료합니다");
				break;
			
		}		
		String p = scan.next();
		if(p.equals("y")) {
			System.out.println("예약되었습니다.");
			break;
		}else {
			System.out.println("예약화면으로 돌아갑니다");
		}
	}

}
}
class Car1{
	int jari = 1;
	int price = 1;
	
	void run() {
	}
	void run1() {
	}
	void run2() {

	}
}
class Bus1 extends Car1{
	Bus1(){
		jari = 5;
		price = 60;
	}
	void run() {
		System.out.println("일반 버스를 예약하시겠습니까?");
	}
	void run1(){
		System.out.printf("남은 좌석은 %d개이고 \n표가격은 %d원입니다.\n", jari, price);
	}
	void run2() {
		System.out.println("예약하시겠습니까? (y/n)");
		}
	}

class Tru1 extends Car1{
	Tru1(){
		jari = 11;
		price = 10000;
	}
	void run() {
		System.out.println("고속 버스를 예약하시겠습니까?");
	}
	void run1(){
		System.out.printf("남은 좌석은 %d개이고 \n표가격은 %d원입니다.\n", jari, price);
	}
	void run2(){
		System.out.println("예약하시겠습니까? (y/n)");
	}
}

