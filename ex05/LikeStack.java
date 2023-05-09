package ex05;

public class LikeStack {

    private LikeList list;

    public LikeStack() {
        list = new LikeList();
    }

    public void push(int value) { // 맨 앞에 새로운 노드 삽입
        list.insert(0, value); // 새로운 노드를 head에 추가
    }

    public void pop() {
        list.delete(0);
    }

    public int peek() { // 스택의 맨 위에 있는 값을 반환
        return list.head.data;
    }

    public boolean isEmpty() {
        return list.size == 0;
    }

    public static void main(String[] args) {
        LikeStack stack = new LikeStack();

        // 스택에 데이터 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 스택에서 데이터 삭제
        stack.pop();

        // 스택 출력
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println(); // 출력: 2 1
    }

}
