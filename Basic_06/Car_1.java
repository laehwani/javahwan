package Basic_06;


class Element{
	int weight = 100;
	int power = 200;
	int price = 300;
	
	void run() {
		System.out.println("세탁기입니다");
		System.out.println("무게는 "+ weight +"kg 입니다.");
		System.out.println("출력은 "+ power +"마력입니다");
		System.out.println("가격은 "+ price +"백만원입니다.");
	}
}
class Com extends Element{
	void run1() {
		System.out.println("돌려 돌려");
		
		for(int i=1; i<20; i++) {
			i = (int)(Math.random()*10)+1;
			
			if(i == 2) {
				System.out.println("당첨입니다");
				break;
			}else if(i ==4 ) {
				System.out.println("당첨입니다");
				break;
			}else {
				System.out.println("아쉽네요");
			}
		}
	}
}

public class Car_1 {

	public static void main(String[] args) {
		Com com = new Com();
		com.run();
		com.run1();
	}
}
