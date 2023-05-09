package ex04;
public class LikeList {
    private Node head; // 첫번째 노드 정보
    private class Node {
        int data; // data field
        Node next; // Link field
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void insert(int index, int data){
        Node newNode = new Node(data);
        if(index == 0 ){ // 맨 앞에 삽입
            newNode.next = head ;
            head = newNode ;
            return ;
        }
        Node now = head ;
        for(int i=0; i<index-1; i++){
            if(now == null){
                throw new IndexOutOfBoundsException();
            }
            now =  now.next;
        }
        if(now == null){
            throw new IndexOutOfBoundsException();
        }
        // 삽입하려는 index에 도달
        newNode.next = now.next ;
        now.next = newNode;

    }
    public void delete(int index){

        if(head == null) return;
        if(index == 0) {
            this.head = head.next;
            return;
        }
        Node now = head;
        for(int i=0; i<index-1; i++){
            if(now == null) {
                throw new IndexOutOfBoundsException();
            }
            now = now.next;
        }
        if(now.next != null) now.next = now.next.next;
    }
    public void print(){
        Node now = head ;
        while( now != null ){
            System.out.print(now.data + " ");
            now = now.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LikeList list = new LikeList();
        list.insert(0,1);
        list.insert(1,2);
        list.insert(2,3);
        list.insert(3,4);
        list.print();
        list.delete(1);
        list.delete(2);
        list.print();
    }
}

