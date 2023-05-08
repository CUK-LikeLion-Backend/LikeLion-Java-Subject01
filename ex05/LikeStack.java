package ex05;

public class LikeStack {

    // LikeList를 사용하여 스택을 구현
    private LikeList list;

    // 생성자
    public LikeStack() {
        list = new LikeList();
    }

    public void push(int value) {
        list.insert(0, value);
    }

    public void pop() {
        list.delete(0);
    }

    public int peek() {
        return list.head.getData();
    }

    // 스택이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return list.head == null;
    }

    // 스택의 모든 값을 출력하는 메서드
    public void print() {
        list.print();
    }


    public static void main(String[] args) {
        LikeStack stack = new LikeStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();

        stack.pop();

        stack.print();


    }




}