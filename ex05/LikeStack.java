package main.java.ex05;

import java.util.List;

public class LikeStack {
    // ex04에서 만든 LikeList 사용
    private LikeList list;

    // 삽입 함수
    public void push(int value) {
        // 클래스 명으로 접근하면 Node 사용 가능
        LikeList.Node newNode = new LikeList.Node(value);


        // 빈 스택이 아닐 경우
        if(list.head != null) {
            newNode.next = list.head;
        }
        list.head = newNode;
    }
    // 삭제 함수
    public int pop() {
        //스택이 빈 경우
        if(isEmpty()){
            return -999;
        }

        int x = list.head.data;
        list.head = list.head.next;
        return x;
    }
    // 스택의 마지막 값 조회
    public int peek() {
        //스택이 빈 경우
        if(isEmpty()){
            return -999;
        }

        return list.head.data;
    }
    // 스택이 비어있다면 true 반환
    public boolean isEmpty() {
        if(list.head == null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LikeStack stack = new LikeStack();
        stack.push(1); // 1
        System.out.println(stack.peek()); // 1
        stack.push(2); // 2 1
        System.out.println(stack.peek()); // 2
        stack.push(3); // 3 2 1
        System.out.println(stack.peek()); // 3

        System.out.println(stack.pop()); // 3 삭제
        System.out.println(stack.pop()); // 2 삭제
        System.out.println(stack.pop()); // 1 삭제
        System.out.println(stack.pop()); // -999(empty)
    }

}
