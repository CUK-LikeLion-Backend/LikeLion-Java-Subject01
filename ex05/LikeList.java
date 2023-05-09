package main.java.ex05;

public class LikeList {
    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insert(int index, int data){
        Node newNode = new Node(data);

        // 빈 리스트일 경우
        if(head == null){
            head = newNode;
            return;
        }

        Node tmp = head;
        int cnt = 0;
        while(tmp.next != null && index + 1 != cnt) {
            tmp = tmp.next;
            cnt++;
        }

        if(tmp.next != null) {
            newNode.next = tmp.next;
        }
        tmp.next = newNode;

    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
            return;
        }
        Node prev = head;
        int cnt = 0;
        while(prev.next != null && index - 1 != cnt){
            prev = prev.next;
            cnt++;
        }

        prev.next = prev.next.next;
    }

    public void print(){
        if(head == null){return;}
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }

}
