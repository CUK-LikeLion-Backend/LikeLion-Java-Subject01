package ex06;

public class LikeQueue {
    private LikeList list;
    public LikeQueue() {
        list = new LikeList();
    }

    // 추가 (맨 뒤에 추가)
    public void enqueue(int value) {
        list.insert(list.size, value);
    }
    // 삭제 (맨 앞 데이터 삭제)
    public void dequeue() {
        list.delete(0);
    }
    // 큐의 첫번쨰 값 조회
    public int peek() {
        return list.firstValue();
    }
    // 큐가 비었는지 확인
    public boolean isEmpty() {
        if (list.getHead() == null)
            return true;
        return false;
    }

    public static void main(String[] args) {
        LikeQueue queue = new LikeQueue();

        System.out.println(queue.isEmpty());

        queue.enqueue(1); //1
        queue.enqueue(2); //1 2
        queue.enqueue(3); //1 2 3
        queue.enqueue(4); //1 2 3 4

        queue.dequeue(); //2 3 4
        queue.dequeue(); //3 4

        System.out.println(queue.peek()); //3
        System.out.println(queue.isEmpty());
    }
}
