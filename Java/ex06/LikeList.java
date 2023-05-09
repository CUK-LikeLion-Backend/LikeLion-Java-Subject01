package ex06;

public class LikeList {
    public Node head;
    public int size;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // 삽입 메서드, index 위치에 노드 추가
    public void insert(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node curNode = head;
            for (int i = 0; i < index - 1; i++) {
                curNode = curNode.next;
            }
            newNode.next = curNode.next;
            curNode.next = newNode;
        }
        size++;
    }

    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        if (index == 0) {
            head = head.next;
        }
        else {
            Node curNode = head;
            for (int i = 0; i < index - 1; i++) {
                curNode = curNode.next;
            }
            curNode.next = curNode.next.next;
        }
        size--;
    }

    // 전체 노드 출력 메서드
    public void print() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
}