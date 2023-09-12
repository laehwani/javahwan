package project2.Class.ch15collection.lecture.C01collection;

import java.util.Stack;

public class C14Stack {
    public static void main(String[] args) {
        // stack (LIFO클래스 : 후입선출)
        // 주요 메서드
        // push : 마지막에 아이템 추가
        // pop : 마지막 아이템 꺼내기(삭제)
        // peek : 마지막 아이템 삭제는 하지않고 확인 하기

        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(3);

        System.out.println("stack.size : "+ stack.size());

        Integer popped = stack.pop();
        System.out.println("popped = " + popped);

        System.out.println("stack.pop = "+ stack.pop());
        System.out.println("stack.pop = "+ stack.pop());

        System.out.println("stack.size : "+ stack.size());

    }

}
