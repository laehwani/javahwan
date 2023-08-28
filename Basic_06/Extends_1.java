package Basic_06;

class child extends Extends_1{ 
	public void right() {
		System.out.println("불 담");
	}
}

public class Extends_1 {
	
	String name;
	int speed, price;
	
	public void setOp(int a, int b) {
		this.speed = a;
		this.price = b;
	}
	public void total() {
		System.out.println("자동차 속도 : "+ this.speed+ "가격 : "+ this.price);
	}
	public void pandan() {
		System.out.println("잘 삼");
	}

	public static void main(String[] args) {
		
		child ch = new child();
		ch.setOp(200, 3000);
		ch.total();
		ch.pandan();
		ch.right();
	}
}

