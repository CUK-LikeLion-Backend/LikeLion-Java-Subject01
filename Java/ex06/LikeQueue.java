package ex06;

import ex06.LikeList;

public class LikeQueue {
    // ex04에서 만든 LikeList 사용
    private LikeList list;

    public LikeQueue() {
        list = new LikeList();
    }

    // 추가
    public void enqueue(int value) {
        list.insert(list.size, value);
    }

    // 삭제
    public void dequeue() {
        list.delete(0);
    }

    // 큐의 첫번째 값 조회
    public int peek() {
        return list.head.data;
    }

    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return list.size == 0;
    }

    public static void main(String[] args) {
        LikeQueue queue = new LikeQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

        queue.dequeue();
        System.out.println(queue.peek());
    }
}
/*
 큐 : FIFO(First in First Out) 형식의 자료 구조
 */