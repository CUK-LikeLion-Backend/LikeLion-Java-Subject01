package 멋사재귀.ex06;

public class LikeQueue {
    private LikeList list = new LikeList();

    // 추가
    public void enqueue(int value) {
        list.insert(list.getListSize(),value);
    }
    // 삭제
    public void dequeue() {
        list.delete(0);
    }
    // 큐의 첫번쨰 값 조회
    public int peek() {
        return list.returnHead();
    }
    // 큐가 비었는지 확인
    public boolean isEmpty() {
        if(list.isEmpty()){
            return true;
        }
        return false;
    }

    public void printQueue(){
        list.print();
    }

    public static void main(String[] args) {
        LikeQueue queue = new LikeQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.printQueue();
        System.out.println();

        queue.dequeue();

        queue.printQueue();
        System.out.println();

        queue.dequeue();
        queue.enqueue(19);

        queue.printQueue();
        System.out.println();

        System.out.println(queue.peek());
    }
}
