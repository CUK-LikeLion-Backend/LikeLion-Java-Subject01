package ex06;

public class LikeQueue {

    private LikeList list;

    public LikeQueue() {
        list = new LikeList();
    }

    public void enqueue(int value) {
        list.insert(list.getSize(), value);
    }

    public void dequeue() {
        list.delete(0);
    }

    public int peek() {
        return list.head.getData();
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void print() {
        list.print();
    }

    public static void main(String[] args) {
        LikeQueue queue = new LikeQueue();

        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);

        queue.print();

        queue.dequeue();

        queue.print();


    }
}