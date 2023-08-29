package homework;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] users = {{"dasom", "1111"},
                {"hwani", "2222"},
                {"hyun", "3333"}};
        // 2차원 배열로 간단하게 [0]열은 아이디, [1]열은 비밀번호로 가정해본다.

        System.out.print("ID 를 입력하세요 : ");
        String inputid = scan.next();
        System.out.print("Password 를 입력하세요 : ");
        String inputpass = scan.next();
        // id 와 비밀번호를 하나씩 따로 따로 입력하기 위해 스캐너로 2개 준비

        boolean login = false;
        for(int i = 0; i < users.length; i++) {
            String[] input = users[i];
            // for 문을 루프시킨 후 [users배열] 안에 i 값을 input 에 담기

            if(input[0].equals(inputid) && input[1].equals(inputpass)){
                // [users] 0번째 줄과 첫번째 스캐너값이 같고
                // [users] 1번째 줄과 두번째 스캐너값이 같다면?
                login = true;
            }
        }
        if(login) {
            System.out.println("주인님!!!");
        }else {
            System.out.println("아니야!!!");
        }
        // login 이 참이면 true 를 뱉고, 거짓이면 else 를 뱉는다.
    }
}

