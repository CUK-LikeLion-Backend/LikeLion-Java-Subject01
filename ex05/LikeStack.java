package ex05;

public class LikeStack {
    private LikeList list;
    public LikeStack() {
        list = new LikeList();
    }

    // 추가
    public void push(int value) {
        //맨위에 들어가는 데이터가 인덱스 0번이고 맨 처음 노드가 됨
        list.insert(0, value);
    }
    // 삭제
    public void pop() {
        //pop은 후입선출이기 때문에 인덱스 0부터 지운다
        list.delete(0);
    }
    // 스택의 마지막 값 조회
    // 마지막값 확인하기 위해 함수 만들기
    public int peek() {
        return list.lastValue();
    }

    // 스택이 비어있다면 true
    // 스택이 비어있는지 확인하기 위해 헤드를 반환하는 메소드 만들기
    // list.lastValue()는 안되지만 getter 메서드를 써서 list.getHead() == null 가능함
    public boolean isEmpty() {
        if (list.getHead() == null)
            return true;
        return false;
    }

    public static void main(String[] args) {
        LikeStack stack = new LikeStack();

        System.out.println(stack.isEmpty());

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
