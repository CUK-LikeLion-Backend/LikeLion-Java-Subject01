package ex05;

public class LikeStack {
    // ex04에서 만든 LikeList 사용
    private static LikeList list;
    public LikeStack() {
        list = new LikeList();
    }
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
        return list.peek();
    }
    // 스택이 비어있다면 true
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        LikeStack st = new LikeStack() ;
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }

}