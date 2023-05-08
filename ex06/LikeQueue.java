package main.java.ex06;

public class LikeQueue {

    // ex04에서 만든 LikeList 사용
    private LikeList list;
    private LikeList.Node front = list.head;
    private LikeList.Node rear = list.head;

    // 삽입 함수
    public void enqueue(int value) {
        LikeList.Node newNode = new LikeList.Node(value);

        // 빈 큐일 때
        if(rear == null){
            list.head = newNode;
            // rear와 front 모두 newNode를 가리키도록 함
            rear = newNode;
            front = newNode;
            return;
        }
        newNode.next = rear.next;
        rear.next = newNode;
        rear = newNode;
    }
    // 삭제 함수
    public int dequeue() {
        if(isEmpty()){
            return -999;
        }
        // 가장 앞에 있는(가장 먼저 삽입된) 수 반환
        int x = front.data;
        list.head = front.next;
        front = front.next;
        return x;
    }

    // 큐의 첫번쨰 값 조회
    public int peek() {
        if(isEmpty()){
            return -999;
        }
        return (front.data);
    }

    // 큐가 비었는지 확인
    public boolean isEmpty() {
        if(rear == null){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        LikeQueue queue = new LikeQueue();
        queue.enqueue(1); // 1
        System.out.println(queue.peek()); // 1
        queue.enqueue(2); // 1 2
        System.out.println(queue.peek()); // 1
        queue.enqueue(3); // 1 2 3
        System.out.println(queue.peek()); // 1
        queue.enqueue(4); // 1 2 3 4
        System.out.println(queue.peek()); // 1
        queue.dequeue(); // 2 3 4
        System.out.println(queue.peek()); // 2
        queue.dequeue(); // 3 4
        System.out.println(queue.peek()); // 3
    }
}
