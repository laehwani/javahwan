package Basic_05;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Search_input extends Job_array {

	String name; 
	void input_name() {
//		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String str1 = JOptionPane.showInputDialog(null,"ID를 입력하세요");
			System.out.printf("찾는 사람 이름 : %s\n", str1);
			
			int count=0;
			String str2 = str1;
//			for(String str2 : nameA) {
//				if(str2.equals(name)) {
//					System.out.println(str2);
//					break;
//			count++;
//			}
//		}
			for(i=0; i<nameA.length; i++) {
				if(str1.equals(nameA[i])) {
					System.out.println(str1);
					break;
				}
				count++;
			}
			if ( str1.equals("no") ) {
				System.out.println("종료해요");
				break;
			}		
		line();
		System.out.println(" 이름    나이     		전화");
		line();
		System.out.printf("%5s %3d %15s", nameA[i], ageA[i],telA[i]);

		}
	}
	
}
