package 멋사재귀.ex05;


public class LikeStack {
    // ex04에서 만든 LikeList 사용
    private LikeList list = new LikeList();

    // 추가
    public void push(int value) {
        list.insert(0,value);
    }
    // 삭제
    public void pop() {
        list.delete(0);
    }
    // 스택의 마지막 값 조회
    public int peek() {
        int n = list.returnHead();
        return n;
    }
    // 스택이 비어있다면 true
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        LikeStack stack = new LikeStack();

        stack.push(3);
        stack.push(4);
        stack.push(1);

        System.out.println(stack.peek());
        System.out.println();

        stack.push(3);

        System.out.println(stack.peek());
        System.out.println();

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
        System.out.println();
    }
}