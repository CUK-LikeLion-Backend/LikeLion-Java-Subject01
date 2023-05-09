package ex05;

import ex05.LikeList;

import java.util.Scanner;

public class LikeStack {
    // ex04에서 만든 LikeList 사용
    public LikeList list;

    public LikeStack() {
        list = new LikeList();
    }
    // 추가
    public void push(int value) {
        list.insert(0, value);
    }
    // 삭제
    public void pop() {
        list.delete(0);
    }
    // 스택의 마지막 값 조회
    public int peek() {
        if (!isEmpty()) {
            return list.head.data;
        }
        return -1;
    }
    // 스택이 비어있다면 true
    public boolean isEmpty() {
        return list.head == null;
    }

    public static void main(String[] args) {
        LikeStack stack = new LikeStack();

        stack.push(3);
        stack.push(5);
        stack.push(1);

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());

        stack.push(2);
        stack.push(7);
        stack.push(8);

        System.out.println(stack.peek());
    }
}
/*
 스택 : 한 쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO(Last in First Out) 형식의 자료 구조
 */