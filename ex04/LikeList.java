package ex04;

public class LikeList {
    private Node head;

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
        Node node = new Node(data);
        Node now = head;

        //아무것도 없을때
        if (now == null){
            head = node;
            return;
        }

        //맨앞에 넣을때
        if (index == 0){
            node.next = head;
            head = node;
            return;
        }

        else {
            for (int i = 0; i < index-1 && now.next != null; i++){
                now = now.next;
            }
            if (now == null)
                return;

            node.next = now.next;
            now.next = node;
        }
    }

    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        Node now = head;

        //아무것도 없을때
        if (now == null){
            return;
        }

        //맨 앞 노드 삭제
        if (index == 0) {
            head = head.next;
            return;
        }

        for (int i = 0; i < index-1 && now != null; i++) {
            now = now.next;
        }
        now.next = now.next.next; //다음다음걸로 연결
    }

    // 전체 노드 출력 메서드
    public void print() {
        Node now = head;
        while (now != null){
            System.out.printf("%d ", now.data);
            now = now.next;
        }
    }

    public static void main(String[] args) {
        LikeList list = new LikeList();
        list.insert(0, 10); //10
        list.insert(2, 30); //10 30
        list.insert(1, 15); //10 15 30
        list.insert(0, 45); //45 10 15 30
        list.insert(1, 40); //45 40 10 15 30

        list.delete(1); //45 10 15 30
        list.delete(2); //45 10 30

        list.print();
    }
}
