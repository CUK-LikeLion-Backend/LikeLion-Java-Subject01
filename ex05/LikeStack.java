package ex05;

public class LikeStack {

    private LikeList list;

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

        // 스택 출력
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println(); // 출력: 3 2 1
    }

}
