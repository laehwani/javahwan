package Reference;

import java.util.Arrays;

public class reference1 {

	public static void main(String[] args) {

		int[] a = {3, 4, 5};
		int[] b = a;
		// a 와 b 는 하나의 인스턴스 값을 가지고 있다.
		// 위에 코드에서 배열형은 참조타입이므로 a 와 b 는 주소값을 서로 참조하고 있다.
		System.out.println(b[2]); // 5
		
		a[2]=8;
		System.out.println(b[2]); // 8
		
		int[] c = {3, 4, 5};
		int[] d = {3, 4, 5};
		// c 와 d 는 같은 값이지만 서로 저장된 주소위치가 드랃.
		System.out.println(d[2]); // 30
		
		c[2] = 90;
		System.out.println(c[2]); // 90
		System.out.println(d[2]); // 5
		// 위에 코드와 다르게 c = d 의 주소값이 같다는 명령을 주지 않았기에 d 까지 변하지는 않는다.
		
		
	}

}
