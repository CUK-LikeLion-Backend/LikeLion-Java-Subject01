package ex04;

public class LikeList {
    private Node head;
    private int size;

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
    public static void main(String[] args) {
        LikeList list = new LikeList();
        list.insert(0, 1);
        list.insert(0, 2);
        list.insert(1, 3);
        list.insert(3, 4);
        list.print();

        list.delete(1);
        list.print();

        list.delete(2);
        list.print();
    }
}
/*
 연결 리스트(Linked List) : 각 노드가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식으로 데이터를 저장하는 자료구조
 - 각 노드는 다음 노드를 가리키는 포인터를 포함한다.
 - 다음 노드를 가리키는 포인터는 다음 노드의 주소를 값으로 가지고 있다.
 - 각 노드의 포인터 변수는 다음 노드의 데이터의 주소를 값으로 가진다. 또한 각 포인터 변수의 주소도 따로 존재한다.
 */