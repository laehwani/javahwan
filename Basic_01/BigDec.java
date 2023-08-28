package Basic_01;

import java.math.BigDecimal;

public class BigDec {

	public static void main(String[] args) {

		double dou1 = 12.53;
		double dou2 = 34.45;
		System.out.println("12.53 + 34.45 = "+ (dou1+dou2));
		
		BigDecimal big1 = new BigDecimal("100.1234512345");
		BigDecimal big2 = new BigDecimal(10);
		
		System.out.println("100.12345 + 10 = " + big1.add(big2));
		System.out.println("100.12345 - 10 = " + big1.subtract(big2));
		System.out.println("100.12345 * 10 = " + big1.multiply(big2));
		System.out.println("100.12345 / 10 = " + big1.divide(big2));
		System.out.println("100.12345 % 10 = " + big1.remainder(big2));
		
		int compare = big1.compareTo(big2);
		System.out.println("compareTo 사용해서 비교 결과 (다르면 1, 같으면 0) 결과 " + compare);
		
	}

}
