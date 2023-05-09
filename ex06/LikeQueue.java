package ex06;

public class LikeQueue {
    private LikeList list;
    public LikeQueue(){
        list = new LikeList();
    }
    public void enqueue(int value){
        list.insert(list.size(), value);
    }

    public void dequeue(){
        list.delete(0);
    }
    public int peek(){
       return list.Peek();
    }
    public boolean isEmpty(){
        if(list.getHead() != null)
            return false;
        return true;
    }

}
class Test{
    public static void main(String[] args) {
        LikeQueue Lq = new LikeQueue();
//        System.out.println(Lq.isEmpty());
        Lq.enqueue(1);
//        System.out.println(Lq.isEmpty());
        System.out.println(Lq.peek());
        Lq.enqueue(2);
        System.out.println(Lq.peek());
        Lq.dequeue();
        System.out.println(Lq.peek());




    }
}
