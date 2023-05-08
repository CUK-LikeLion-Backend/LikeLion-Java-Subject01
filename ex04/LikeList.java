package main.java.ex04;

public class LikeList {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    // 삽입 함수
    public void insert(int index, int data){
        Node newNode = new Node(data);

        // 빈 리스트일 경우
        if(head == null){
            head = newNode;
            return;
        }

        // 첫 번째 인덱스에 삽입
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node tmp = head;
        int cnt = 0;
        // 해당 인덱스까지 찾아가기
        while(tmp.next != null && index - 1 != cnt) {
            tmp = tmp.next;
            cnt++;
        }

        // 해당 인덱스가 마지막 인덱스가 아닐 경우
        if(tmp.next != null) {
            newNode.next = tmp.next;
        }
        tmp.next = newNode;

    }

    // 삭제 함수
    public void delete(int index){
        // 첫 번째 인덱스 값 삭제
        if(index == 0){
            head = head.next;
            return;
        }
        Node prev = head;
        int cnt = 0;
        // 해당 인덱스까지 이동
        while(prev.next != null && index - 1 != cnt){
            prev = prev.next;
            cnt++;
        }

        prev.next = prev.next.next;
    }

    // 출력 함수
    public void print(){
        if(head == null){return;}
        Node tmp = head;
        while(tmp != null){
            System.out.printf("%d ", tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LikeList list = new LikeList();
        // 삽입
        list.insert(0, 10);
        list.print(); // 10
        list.insert(1, 20);
        list.print(); // 10 20
        list.insert(2, 30);
        list.print(); // 10 20 30
        list.insert(0, 5);
        list.print(); // 5 10 20 30
        list.insert(1, 7);
        list.print(); // 5 7 10 20 30

        // 삭제
        list.delete(2);
        list.print(); // 5 7 20 30
        list.delete(0);
        list.print(); //7 20 30
    }
}
