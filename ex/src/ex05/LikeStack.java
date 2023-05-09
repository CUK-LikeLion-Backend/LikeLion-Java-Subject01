package ex05;

public class LikeStack {

    // ex04에서 만든 ex06.LikeList 사용
    private LikeList list;

    public LikeStack(){
        list=new LikeList();
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
        return list.getNode(0).getData();
    }

    // 스택이 비어있다면 true
    public boolean isEmpty() {
        return list.head==null;
    }

    public static void main(String[] args) {
        LikeStack likeStack=new LikeStack();
        likeStack.push(3);
        System.out.println(likeStack.peek());
        likeStack.push(5);
        System.out.println(likeStack.peek());
        likeStack.push(6);
        System.out.println(likeStack.peek());
        likeStack.pop();
        System.out.println(likeStack.peek());
        System.out.println(likeStack.isEmpty());
    }

}
