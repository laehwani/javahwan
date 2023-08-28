package Basic_05;

class Car{
	int speed;
	Car(){
		System.out.println("Car클래스의 생성자 완료");
	}}
class Car2{
	String name;
	int price;
	Car2(String a, int b){
		this.name = a;
		this.price = b;
	}}
class Car3{
	String name;
	int speed;
	String color;
	Car3(String a, int b, String c){
		this.name = a;
		this.speed = b;
		this.color = c;
	}
}
class Person{
	String name;
	int age;
	String so;
	Person(String a, int b, String c) {
		this.name = a;
		this.age = b;
		this.so = c;
	}
}
class Person2{
	String name;
	int age;
	String so;
	Person2() {
		this.name = "아무개";
		this.age = 23;
		this.so = "개발자";
		System.out.printf("이름은 %s 이고요, \n나이는 %d대쯤이고요, "
				+ "\n어쨌든 %s 입니다\n",name,age,so);

	}	
}

public class ConstCar {

	public static void main(String[] args) {

		Car car = new Car();
		Car2 Car2 = new Car2("제네시스", 4000);
		System.out.println("이름 : "+ Car2.name+ " 가격 : "+ Car2.price);
		Car3 Car3 = new Car3("소나타", 200, "흰색");
		System.out.printf("이름 : %s \n최고출력 : %d \n색상: %s",
				Car3.name,Car3.speed,Car3.color);

		Person Person = new Person("김다솜", 40, "사람이므니다");
		System.out.printf("\n이름은 %s 이고요, \n나이는 %d대쯤이고요, \n어쨌든 %s\n", 
				Person.name, Person.age, Person.so);
		
		Person2 Person2 = new Person2();
		System.out.println("이름이 뭐라고 했나요? ");
		
		

 	}

}
