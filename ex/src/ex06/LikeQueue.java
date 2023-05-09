package ex06;

import java.util.EmptyStackException;

public class LikeQueue {
    private LikeList list;

    public LikeQueue() {
        list = new LikeList();
    }

    public void enqueue(int data) {
        list.insert(list.getSize(), data);
    }

    public int dequeue() {
        if (list.getSize() == 0) {
            throw new EmptyStackException();
        }
        int data = list.getNodeValue(0);
        list.delete(0);
        return data;
    }

    public int peek() {
        if (list.getSize() == 0) {
            throw new EmptyStackException();
        }
        return list.getNodeValue(0);
    }

    public boolean isEmpty() {
        return list.getSize() == 0;
    }

    public void print() {
        list.print();
    }

    public static void main(String[] args) {
        LikeQueue queue = new LikeQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.print();

        queue.dequeue();
        queue.print();

        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
