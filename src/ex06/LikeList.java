package ex06;

public class LikeList {

    private Node head;

    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int index, int data){
//        Node pre, temp;
//        Node newNode = new Node(data); //삽입할 노드 생성
//        newNode.data = data;
//
//        pre = head; //이전 노드
//        temp = head.next; //현재 노드
//
//        while(pre.next != null){    //마지막 노드가 아닐때
//            if(pre.data == data){
//                System.out.println("a");
//                newNode.next = temp;    //삽입할 노드의 next에 temp
//                pre.next = newNode;     //pre의 next에 삽입할 노드
//                break;
//            }
//            else if(pre.data != index){
//                System.out.println("b");
//                pre = temp;     //다음 노드를 가리키도록
//                temp = temp.next;
//            }
//        }
//        pre.next = newNode;
//        //while종료시 마지막 노드 가리키고 있기에 pre.next는 null인 상태이므로
//        // pre.next에 새로운 노드 할당하여 연결해줘야함

        Node newNode = new Node(data);
        Node pre;

        //맨 앞에 삽입하는 경우
        if(index == 0) {    //이전 노드가 없음
            newNode.next = head;
            head = newNode;
        }
        else{   //이전 노드가 이미 존재
            pre = get(index - 1);   //삽입하려는 위치 이전 노드
            newNode.next = pre.next;
            pre.next = newNode;
        }


    }

    public void delete(int index) {
//        Node pre, temp;
//
//
//        if(head.next == null){  //head가 마지막 노드일 때
//            if(head.data == index){
//                head = null;
//            }
//        }
//
//        pre = head;
//        temp = head.next;
//
//        while(temp != null){    //마지막 노드가 아닐때
//            if(pre.data == index){ //pre의 data가 삭제할 인덱스라면
//                head = head.next;   //head에 head의 다음 노드 대입(head는 삭제)
//                break;
//            }
//            if(temp.data == index){ //temp의 data가 삭제할 인덱스라면
//                pre.next = temp.next;   //pre.next에 temp의 다음 노드 대입(temp 삭제)
//                break;
//            }
//
//            pre = temp; //다음 노드로 한칸씩 이동
//            temp = temp.next;
//        }
        Node pre;

        if(index == 0){
            head = head.next;
        }
        else{
            pre = get(index - 1);
            pre.next = pre.next.next;
//            pre.next = get(index).next;
        }

    }

    public void print(){
        Node newNode = head;

        while(newNode != null){
            System.out.print(newNode.data);
            newNode = newNode.next;
            if(newNode!=null){
                System.out.print(", ");
            }

        }
        //System.out.println();

    }

    public int getData(Node node){
        return node.data;
    }
    public int getLast() {
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        return last.data;
    }

    public Node get(int index){
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }

        Node temp = head;
        for(int i = 0; i < index; i++){
            if(temp == null) {
                return null;
            }
            temp = temp.next;
        }

        return temp;
    }

    public int size(){
        int count = 0;
        Node current = head;

        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }



}
