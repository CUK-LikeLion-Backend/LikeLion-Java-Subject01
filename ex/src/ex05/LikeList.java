package ex05;

public class LikeList {

    public Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

        public int getData() {
            return data;
        }
    }



    // 삽입 메서드, index 위치에 노드 추가
    public void insert(int index, int data) {
        Node newNode=new Node(data);

        if(index==0){
            newNode.next=head;
            head=newNode;
        }else{
            Node prev=getNode(index-1);
            if(prev==null){ // index가 1이상인데 이전 노드가 없음
                return;
            }else{
                newNode.next=prev.next;
                prev.next=newNode;
            }
        }
    }


    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        if(index==0){
            head=head.next;
        }else{
            Node prev=getNode(index-1);
            if(prev==null||prev.next==null){ // 이전 노드가 없거나 목표로 하는 노드가 없을때
                return;
            }else{
                prev.next=prev.next.next;
            }
        }
    }


    // 전체 노드 출력 메서드
    public void print() {
        Node newNode=head;
        while(newNode!=null){
            System.out.println(newNode.data);
            newNode=newNode.next;
        }
        System.out.println();
    }


    public Node getNode(int index) {
       Node curr = head;
        for (int i = 0; i < index; i++) {
            if (curr == null) {
                return null;
            }
            curr = curr.next;
        }
        return curr;
    }


}
