package 멋사재귀.ex06;

public class LikeList {

    private Node head;

    private int listSize=0;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // 삽입 메서드, index 위치에 노드 추가
    public void insert(int index, int data) {
        if(index> listSize) {
            System.out.println("인덱스 에러");
            return;
        }
        
        Node newNode = new Node(data);

        if(index==0){
            if(isEmpty()){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
            listSize++;
            return;
        }

        Node p = head;

        for(int i=0; i<index-1; i++) {
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
        listSize++;
        return;
    }

    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        if(index> listSize) {
            System.out.println("인덱스 에러");
            return;
        }

        if(index==0){
            head = head.next;
            listSize--;
            return;
        }

        Node p = head;

        for(int i=0; i<index-1; i++) {
            p = p.next;
        }

        if(p.next.next == null){
            p.next = null;
        }
        else{
            p.next = p.next.next;
        }
        listSize--;
    }

    public boolean isEmpty(){
        if(listSize==0){
            return true;
        }
        return false;
    }

    // 전체 노드 출력 메서드
    public void print() {
        int i;
        Node nowNode = head;
        if(isEmpty()){
            System.out.println("비어있습니다.");
        }
        for(i=0; i<listSize; i++){
            System.out.println(nowNode.data);
            nowNode = nowNode.next;
        }
    }
    
    public int returnHead(){
        if(isEmpty()){
            System.out.println("비어있습니다");
        }
        return head.data;
    }

    public int getListSize(){
        return this.listSize;
    }

    public static void main(String[] args) {
        LikeList list = new LikeList();

        list.insert(0,3);
        list.insert(1,4);
        list.insert(2,5);
        list.insert(0,2);
        list.insert(0,1);

        list.print();
        System.out.println();

        list.delete(0);
        list.delete(1);
        list.delete(2);

        list.print();
        System.out.println();

        list.delete(0);

        list.print();
        System.out.println();

        list.delete(0);

        list.print();
        System.out.println();
    }
}