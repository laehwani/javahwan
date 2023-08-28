package Basic_04;

public class Method_06 {

//	public class phone{
		 String model;
		 String color; // phone클래스 필드 생성
		
		 Method_06(String model,String color){
			 
				this.model = model;
				this.color = color;
				
		 }
//		 Method_06(String model){
//			 
//			 this("자동차", "은색");
//		 }

		 		
//		static void bell() {
//			System.out.println("벨이 울려요");
//		} // phone클래스 메서드 생성
//		
//		static void send1(String message) {
//			System.out.println("자기"+ message);
//		}
//		static void send2(String message) {
//			System.out.println("상대방"+ message);
//		}
//		static void hang() {
//			System.out.println("전화를 끊습니다");
//		}	
//	}
//	public class smartPhone extends phone{
//		public String wifi;
//	
//

	public static void main(String[] args) {

		Method_06 my = new Method_06("스포츠카","흰색");

		System.out.println("모델: "+ my.model);
		System.out.println("색상: "+ my.color);


	}
	

}

