package ex05;

import java.util.EmptyStackException;

public class LikeStack {
    private LikeList list;

    public LikeStack() {
        list = new LikeList();
    }

    public void push(int data) {
        list.insert(0, data);
    }

    public int pop() {
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
        LikeStack stack = new LikeStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();

        stack.pop();
        stack.print();

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
