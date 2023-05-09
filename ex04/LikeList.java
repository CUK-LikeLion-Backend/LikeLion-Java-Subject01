package ex04;

public class LikeList {
    private Node head;
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    //삽입 메서드, index 위치에 노드 추가
    public void insert(int index, int data){
        Node newNode = new Node(data);
        if(index == 0) {
//            if (head == null)
//                head = newNode;
//            else {
//                newNode.next = head;
//                head = newNode;
//            }
            newNode.next = head;
            head = newNode;
        }
        else {
//            if(head != null){
//                Node pre = head;
//                int current_index = 1;
//                while (current_index < index){
//                    pre = pre.next;
//                    current_index++;
//                }
//            }
            Node pre = head;
            int CurrenIndex = 0;
            while (CurrenIndex < index - 1 && pre != null){
                pre = pre.next;
                CurrenIndex++;
            }
            if (pre != null){
                newNode.next = pre.next;
                pre.next =newNode;
            }

        }


    }
    //삭제 메서드, Index 위치에 노드 삭제
    public void delete(int index){
        Node Old = head;
        Node pre = null;
        int Currentindex = 0;
       //인덱스 - 1 노드의 next를 인덱스+1 노드로 연결시켜야함.

        // 삭제할 노드 탐색
        while (Currentindex < index){
            pre = Old;
            Old = Old.next;
            Currentindex++;
        }

        if(index == 0){
            head = Old.next;
        }
        else if (Old == null) {
            //삭제할 노드가 마지막인 경우.
            pre.next = null;
        }
        else {
            //삭제할 노드가 중간에 있는 경우.
            pre.next = Old.next;
        }



    }
    //전체 노드 출력 메서드
    public void print(){
        Node node = head;

        while (node != null){
            if (node.next == null)
                System.out.println(node.data);
            else
                System.out.print(node.data+" >> ");

            node = node.next;
        }


    }
    public static void main(String[] args) {
        LikeList list = new LikeList();
        for(int i = 0;i<10;i++){
            list.insert(i, i);
        }
//        list.delete(1);
//        list.delete(8);
//        list.delete(9);
//        list.delete(2);


        list.print();
    }

}



