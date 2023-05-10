package ex06;

public class LikeQueue {

    private LikeList list;

    public LikeQueue(){

        list = new LikeList();
    }
    public void enqueue(int value){     //연결리스트의 마지막 노드에 추가됨

        list.insert(list.size(), value);
    }
    public void dequeue(){  //첫번째 노드부터 삭제
        if (isEmpty()) {    //큐가 비어있는 지 확인
            throw new IllegalStateException("Queue is empty");
        }

        list.delete(0);
    }
    public int peek(){  //큐의 첫번째 값 조회
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getData(list.get(0));
    }
    public boolean isEmpty(){

        return list.size() == 0;
    }
    public void print(){
        list.print();
    }

    public static void main(String[] args) {
//        LikeQueue queue = new LikeQueue();
//
//        for(int i = 1; i <= 5; i++){
//            queue.enqueue(i);
//        }
//
//        queue.dequeue();
//        queue.
        LikeQueue queue= new LikeQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

        queue.print();
    }

}
