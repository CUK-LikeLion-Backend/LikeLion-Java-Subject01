package ex06;

public class LikeQueue {
    private static LikeList list;
    public LikeQueue() {
        list = new LikeList();
    }
    public void enqueue(int value){
        list.insert(0,value);
    }
    public void dequeue() {
        list.delete(list.size() - 1);
    }
    public int peek(){
        return  list.peek() ;
    }

    public boolean isEmpty(){
        if (list.size() == 0 ) return true;
        return false ;
    }

    public static void main(String[] args) {
        LikeQueue Q = new LikeQueue();
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        System.out.println(Q.peek());
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        System.out.println(Q.peek());
        Q.dequeue() ;
        System.out.println();
    }
}
