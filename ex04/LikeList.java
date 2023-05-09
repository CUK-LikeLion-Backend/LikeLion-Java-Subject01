package ex04;

public class LikeList {
    private Node head;
    private int size = 0;
    public int getSize() {
        return size;
    }
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

        Node h = this.head; // 새로운 노드 h는 현재 head를 가르키는것
        Node preH = null; // 초반에 이전 노드는 가르키는게 없으니 null로 선언해준다.

        Node newNode = new Node(data); // 새로운 노드 생성

        if(index > this.size){
            System.out.println("index 에러");
            return; // 인덱스 에러로 더이상 진행 못하니까 return시켜준다.
        }
        // i를 증가시키고 바로 사용하기에 전위 증가 연산자 사용
       for(int i =0; i<index;++i){ // 삽입하고자 하는 노드를 찾지 위해 인덱스에 해당하는 노드를 찾는 과정
           preH = h;
           h = h.next;
       }
        if (preH == null) { // 이전 노드가 null을 가르킨다는 것은 리프라는 뜻이니 거기다가 삽입
            newNode.next = this.head;
            this.head = newNode;
        }else{ // 리프가 아니기에 리프에 위치하도록 preH뒤에 newNode를 위치시켜서 삽입한다.
            newNode.next = preH.next;
            preH.next = newNode;
        }
        this.size++; // 삽입을 하였으니 리스크의 크기를 늘려준다.
    }
    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        Node h = this.head;
        Node preH = null;

        if(index >= this.size){ // 인덱스보다 리스트의 size가 작다는 것은 인덱스 에러가 발생한 것
            System.out.println("index 에러");
            return;
        }
        // i를 증가시키고 바로 사용하기에 전위 증가 연산자 사용
        for(int i=0; i<index; ++i){ // 삭제하려는 노드를 찾기위해 인덱스에 해당하는 노드를 찾는 과정
            preH = h;
            h = h.next;
        }
        if(preH == null){ // 이전 head가 null을 가르킨다는 것은 삭제를 하면 현재 head가 null을 가르키게 된다는 것이니
            this.head=null;
        }else{
            preH.next=h.next;
        }

    }
    public int get(int index) {
        Node h = this.head;

        if (index >= this.size) {
            System.out.println("index 에러");
            return -1;
        }
        for (int i=0; i<index; ++i) {
            h = h.next;
        }
        return h.data;
    }
    // 전체 노드 출력 메서드
    public void print() {
        Node h = this.head;
        int idx = 0;
        while (h != null) {
            System.out.println("idx: " + idx + " data: " + h.data);
            h = h.next;
            idx++;
        }
    }

    public static void main(String[] args) {
        LikeList myList = new LikeList();
        myList.insert(0, 1);
        myList.insert(1, 2);

        myList.print();

        myList.insert(2, 9);
        myList.insert(2, 8);
        myList.insert(2, 7);
        myList.insert(2, 6);
        myList.insert(2, 5);
        myList.insert(2, 4);
        myList.insert(2, 3);

        System.out.println("===========");
        myList.print();

        myList.delete(1);
        myList.delete(2);
        myList.delete(3);
        myList.delete(4);

        System.out.println("===========");
        myList.print();
    }
}