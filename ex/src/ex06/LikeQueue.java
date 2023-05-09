package ex06;

public class LikeQueue {

    // ex04에서 만든 LikeList 사용
    private LikeList list;

    public LikeQueue() {
        list = new LikeList();
    }

    // 추가
    public void enqueue(int value) {
        list.insert(list.size(), value);
    }
    // 삭제
    public void dequeue() {
        list.delete(0);
    }
    // 큐의 첫번쨰 값 조회
    public int peek() {
        LikeList.Node node = list.getNode(0);
        if (node != null) {
            return node.data;
        } else {
            return -1;
        }
    }
    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return list.size() == 0;
    }

    public static void main(String[] args) {
        LikeQueue likeQueue=new LikeQueue();
        likeQueue.enqueue(3);
        likeQueue.enqueue(1);
        likeQueue.enqueue(2);
        System.out.println(likeQueue.peek());
        likeQueue.dequeue();
        System.out.println(likeQueue.peek());

    }
}