package ex04;

public class LikeList {

    private Node head; // 연결 리스트의 첫 번째 노드
    private int size; // 연결 리스트에 저장된 노드의 수

    public class Node {
        int data;
        Node next; // 다음 노드를 가리키는 참조 변수

        Node(int data) {
            this.data = data;
            next = null;
        }
    } // head = null, size = 0

    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } // 인덱스의 유효성 판단, 유효하지 않으면 예외를 발생 시킴

        Node newNode = new Node(data);

        if (index == 0) { // 삽입 위치가 맨 앞
            newNode.next = head; // 'head' 변수를 새로운 노드로 바꾸고
            head = newNode; // 새 노드의 'next' 변수를 이전 'head' 노드로 설정
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++; // 리스트의 크기 1 증가
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(); // 유효하지 않은 인덱스 사용시 발생
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        size--;
    }
    public void print() {
        Node current = head;
        while (current != null) { // current 노드 변수가 null이 아닐 때까지 반복
            System.out.print(current.data + " "); // null이 되면 탐색 종료
            current = current.next; // 변수를 다음 노드로 이동
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LikeList list = new LikeList();

        // 리스트에 데이터 추가
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 3);

        // 리스트 출력
        list.print(); // 출력: 1 2 3

        // 리스트에서 데이터 삭제
        list.delete(1);

        // 리스트 출력
        list.print(); // 출력: 1 3
    }


}
