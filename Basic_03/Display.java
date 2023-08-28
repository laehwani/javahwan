package Basic_03;

public class Display {

	public static void main(String[] args) {

		String s_1 = "abcdefg";
		String s_2 = "ABCDEFG";
		int i_1 = 1234567;
		double pi = 3.141592;
		
		System.out.println( String.format("%20s", s_1)); 
		//총 자리수 20자리로 앞에 공백 채우기
		System.out.println( String.format("%,30d", i_1)); 
		// 앞에 , 를 넣어 숫자 단위별 콤마 찍기
		System.out.println( String.format("%,06.5f", pi)); 
		System.out.println("---------------");
		
		System.out.println( String.format(s_2.toLowerCase())); // 소문자변환
		System.out.println( String.format(s_2.toUpperCase())); // 대문자변환

		String s_3 = "   abc   ";
		System.out.println( s_3 );
		System.out.println( s_3.trim()); // trim 은 양사이드 공백 모두 지우기
		System.out.println("---------------");
		
		System.out.println( "문자 추출 : " + s_1.substring(2,5)); 
		// 2번째부터 5번째까지 문자 추출 
		System.out.println("---------------");
		
		char[] charA = s_2.toCharArray();
		for(int k=0; k<charA.length; k++) {
			System.out.printf("[%d] : %s \n", k, charA[k]);
		}
		System.out.println("---------------");
		
		String kor = "한글 입력을 시작 합니다.";
		String[] wordA = kor.split(" +");
		for(int k=0; k<wordA.length; k++) {
			System.out.println(k +" : "+ wordA[k] );
		}
		System.out.println("---------------");
		
		System.out.println("알파벳 소문자가 있냐?"+ s_1.matches("[a-z]"));
		// 소문자가 1개 있으면 true, 없으면 false
		System.out.println("알파벳 소문자가 있냐?"+ s_1.matches("[a-z]+"));
		// 소문자가 1개 이상 있으면 true
		System.out.println("---------------");
		
//		String pw = "123abc";
//		System.out.println(pw.matches("[0-8]"));
//		// 숫자가 1개 이상 있으면 true
//		System.out.println(pw.matches("[0-8]+"));
		
		String[] strA = { "자바", "웹표준", "백엔드", "프론트"};
		System.out.println( String.join(", ", strA));
		System.out.println( String.join(" - ", strA));
		// 문자 배열 사이사이마다 특정 문자 한번에 넣기
		
		// 문자열 관련 표현식
		String a1 = "컴퓨터";
		String a2 = "컴퓨터";
		System.out.println(a1.compareTo(a2));
		// 같으면 0 을 출력한다 
		a2 = "학교";
		System.out.println(a1.compareTo(a2));
		// a2 가 a1 보다 크면 음수
		
		String c_1 = "Abc";
		System.out.println(c_1.equals("abc"));
		// 대소문자 구분해서 다르면 false
		System.out.println(c_1.equalsIgnoreCase("abc"));
		// 대소문자 구분해서 다르면 true
		
		System.out.println(a1.startsWith("컴")); // 첫 글자가 동일하면 true
		System.out.println(a1.endsWith("컴")); // 첫 글자가 다르다면 false
		System.out.println("---------------");
		
		String c_2 = "abc123 ? kbs456: sbs777";
		System.out.println(c_2.replace("abc", ""));
		System.out.println(c_2.replace("?", ""));
		// 앞에 해당하는 문자를 뒤에 속성으로 바꾼다 "abc" 를 "" 공백으로 바꾼다는 뜻
		System.out.println(c_2.replaceAll("[0-9]",""));
		// [ ] 안에 해당하는 숫자를 공백으로 바꾼다.
		System.out.println("---------------");
		
		String book = "1, 자바 학습, 참조 타입, String을 학습합니다, 홍길동";
		String[] tokens = book.split(", ");
		System.out.println( "번호 "+ tokens[0]);
		System.out.println( "번호 "+ tokens[1]);
		System.out.println( "번호 "+ tokens[2]);
		System.out.println( "번호 "+ tokens[3]);
		// 스플릿 뒤에 조건문자를 기준으로 문자열을 나눈다. 		
		for(int i=0; i<tokens.length; i++) {
			System.out.println("번호 : "+tokens[i]);
		}
		System.out.println("---------------");
		
		for(String str : tokens) {
			System.out.println("번호는 : "+str);}
		// 향상된 for 문이다. 반드시 숙지.
		int[] jumsu = {50, 60, 70};
		for(int no : jumsu) {
			System.out.println(no);
		}
		// 향상된 for 문이다. 반드시 숙지.
		System.out.println("---------------");
		
		String[] nameA = {"홍길동", "이동수", "김철수"};
		int o=0;
		for( String str : nameA) {
			o++;
			System.out.println("["+ o + "]" + str);
		}
	} 
	

}
