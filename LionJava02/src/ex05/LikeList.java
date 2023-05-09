package ex05;

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
    public int peek(){
        if(head == null){
            System.out.println("비어 있는 리스트입니다.");
            return 0;
        }
        return head.data ;
    }
    public boolean isEmpty(){
         Node now = this.head ;
         if(head == null) return true;
         return false;
    }

}
