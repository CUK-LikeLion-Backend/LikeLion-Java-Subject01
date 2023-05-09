package ex06;

public class LikeList {
    private Node head;
    public int size;

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
            size++;
            return;
        }

        //맨앞에 넣을때
        if (index == 0){
            node.next = head;
            head = node;
            size++;
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

        size++;
    }

    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        Node now = head;

        //아무것도 없을때
        if (now == null){
            size--;
            return;
        }

        //맨 앞 노드 삭제
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        for (int i = 0; i < index-1 && now != null; i++) {
            now = now.next;
        }
        now.next = now.next.next; //다음다음걸로 연결

        size--;
    }

    // 전체 노드 출력 메서드
    public void print() {
        Node now = head;
        while (now != null){
            System.out.printf("%d ", now.data);
            now = now.next;
        }
    }

    public int firstValue() {
        Node now = head;

        //리스트가 비었을때!!!!! 꼭 써줘야함 안써주면 에러낭
        if (now == null) {
            return -1;
        }
            return now.data;
    }

    public Node getHead(){
        return head;
    }
}
