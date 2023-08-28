package Basic_05;
import javax.swing.JOptionPane;
public class Job_array {

	
	String[] nameA = {"홍길동", "이동수", "김철수", "이다혜", "강수정"};
	int[] ageA = {10, 20, 30, 40, 50};
	String[] telA = {"010", "011", "012", "013", "014"};
	
	int i, count=0;
	void line() {
		System.out.println("-----------------------");		
	}
	void Job_print() {
		System.out.println("데이터 출력");
		line();
		System.out.println(" 이름    나이      전화");
		line();
		
		for(int i=0; i<nameA.length; i++) {
			System.out.println(nameA[i]+ "\t"+ ageA[i]+ "\t"+ telA[i]);	
		}
	}
}
