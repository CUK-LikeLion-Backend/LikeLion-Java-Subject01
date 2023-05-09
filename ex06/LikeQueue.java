package ex06;

public class LikeQueue {

    // LikeList를 사용하여 큐 구현
    private LikeList list;

    public LikeQueue() {
        list = new LikeList();
    }

    // 큐의 맨 뒤에 데이터 추가
    public void enqueue(int value) {
        list.insert(list.size, value);
    }

    // 큐의 맨 앞에서 데이터 삭제
    public void dequeue() {
        list.delete(0);
    }

    // 큐의 첫번째 데이터 반환
    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return list.head.data;
    }

    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return list.size == 0;
    }


    public static void main(String[] args) {
        LikeQueue queue = new LikeQueue();
        // 큐가 비어있는지 확인
        System.out.println(queue.isEmpty()); // true

        // 큐에 데이터 삽입
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // 큐의 첫번째 데이터 조회
        System.out.println(queue.peek()); // 1

        // 큐에서 데이터 삭제
        queue.dequeue();

        // 큐의 첫번째 데이터 조회
        System.out.println(queue.peek()); // 2


        // 큐가 비어있는지 확인
        System.out.println(queue.isEmpty()); // false
    }

}
