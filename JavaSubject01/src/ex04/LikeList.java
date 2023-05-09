package ex05;

public class LikeList {

    private Node head;
    private Node tail;
    private int size = 0;

    public int getSize(){
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
    Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }
    // 삽입 메서드, index 위치에 노드 추가
    public void addFirst(int input){
        // 노드를 생성합니다.
        Node newNode = new Node(input);
        // 새로운 노드의 다음 노드로 해드를 지정합니다.
        newNode.next = head;
        // 헤드로 새로운 노드를 지정합니다.
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
    }
    public void insert(int index, int data) {
        if(size == 0) {
            addFirst(data);
        }
        else {
            Node temp1 = node(index - 1);
            // index 번째 노드를 temp2로 지정합니다.
            Node temp2 = temp1.next;
            // 새로운 노드를 생성합니다.
            Node newNode = new Node(data);
            // temp1의 다음 노드로 새로운 노드를 지정합니다.
            temp1.next = newNode;
            // 새로운 노드의 다음 노드로 temp2를 지정합니다.
            newNode.next = temp2;
            size++;
            // 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정합니다.
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    // 삭제 메서드, index 위치에 노드 삭제
    public void removeFirst(){
        // 첫번째 노드를 temp로 지정하고 head의 값을 두번째 노드로 변경합니다.
        Node temp = head;
        head = temp.next;
        // 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담습니다.
        Object returnData = temp.data;
        temp = null;
        size--;
    }
    public void delete(int index) {
        if(index == 0)
            removeFirst();
        // k-1번째 노드를 temp의 값으로 지정합니다.
        Node temp = node(index-1);
        // 삭제 노드를 todoDeleted에 기록해 둡니다.
        // 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없습니다.
        Node todoDeleted = temp.next;
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
        temp.next = temp.next.next;
        // 삭제된 데이터를 리턴하기 위해서 returnData에 데이터를 저장합니다.
        Object returnData = todoDeleted.data;
        if(todoDeleted == tail){
            tail = temp;
        }
        // cur.next를 삭제 합니다.
        todoDeleted = null;
        size--;
    }

    // 전체 노드 출력 메서드
    public void print() {// 노드가 없다면 []를 리턴합니다.
        if(head == null){
            System.out.print("[]");
        }
        // 탐색을 시작합니다.
        Node temp = head;
        System.out.print("[");
        System.out.print(temp.data);
        temp = temp.next;
        // 다음 노드가 없을 때까지 반복문을 실행합니다.
        // 마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외됩니다.
        while(temp!=null){
            System.out.print( ","+temp.data);
            temp = temp.next;
        }
        // 마지막 노드를 출력결과에 포함시킵니다.
        System.out.println("]");
    }
    public int get(int index) {
        Node h = this.head;

        if (index >= this.size) {
            System.out.println("index error");
            return -1;
        }
        for (int i=0; i<index; ++i) {
            h = h.next;
        }
        return h.data;
    }

    public static void main (String [] args) {
        LikeList numbers = new LikeList();
        numbers.insert(0,10);
        numbers.print();
        numbers.insert(1,20);
        numbers.print();
        numbers.insert(2,30);
        numbers.print();
        numbers.delete(2);
        numbers.print();
        numbers.delete(1);
        numbers.print();
        numbers.insert(1,30);
        numbers.print();
    }
}
