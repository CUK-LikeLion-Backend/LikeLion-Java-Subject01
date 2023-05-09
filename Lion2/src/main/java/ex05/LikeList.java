package main.java.ex05;

public class LikeList {
    private Node head;
    private Node tail;
    private int size=0;
    private class Node{
        private Object data;
        private Node next;
        public Node(Object input){
            this.data=input;
            this.next=null;
        }
        public String toString(){ //객체를 문자열로 리턴하는 ,출력 될 문자열을 지정할 수 있다.
            return String.valueOf(this.data); //this.data를 string으로 반환함다.
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public void addFirst(Object input){
        Node newNode=new Node(input);
        newNode.next=head;
        head=newNode;
        size++;
        if(head.next==null){
            tail=head;
        }
    }
    public void addLast(Object input){
        Node newNode=new Node(input);
        if(size==0) {         //데이터가 없다면
            addFirst(input);
        }else{
            tail.next=newNode;
            tail=newNode;
            size++;
        }
    }
    Node node(int index){
        Node x=head;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        return x; //head값 리턴
    }
    public void add(int k,Object input){
        if(k==0){
            addFirst(input);
        }else{
            Node temp1=node(k-1);
            Node temp2=temp1.next;
            Node newNode=new Node(input);
            temp1.next=newNode;
            newNode.next=temp2;
            size++;
            if(newNode.next==null){
                tail=newNode;
            }
        }
    }
    public String toString(){
        if(head==null){
            return "[]";
        }
        Node temp=head;
        String str="[";
        while(temp.next!=null){
            str+=temp.data+","; //,는 값과 값을 구분해준다.
            temp=temp.next;
        }//마지막 노드는 while문이 실행되지 않는다.
        str+=temp.data;
        return str+"]";
    }
    public Object removeFirst(){
        Node temp=head;
        head=head.next;
        Object returnData=temp.data;
        temp=null;
        size--;
        return returnData;
    }
    public Object remove(int k) {
        if (k == 0) {
            return removeFirst();
        }
        Node temp=node(k-1);
        Node todoDeleted=temp.next;
        temp.next=temp.next.next;
        Object returnData= todoDeleted.data;
        if(todoDeleted==tail ){
            tail=temp;
        }
        todoDeleted=null;
        size--;
        return returnData;
    }
    public Object removeLast(){
        return remove(size-1);
    }
    public int size(){
        return size;
    }
    public Object get(int k){
    Node temp=node(k);
    return temp.data;
    }
    public static void main(String[] args) {
        LikeList numbers=new LikeList();
        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.add(1,15); //index1위치에 15라는 값을 넣겠다는 의미.
        numbers.addFirst(5);
        System.out.println(numbers);
        System.out.println(numbers.removeFirst());
        System.out.println(numbers);
        System.out.println(numbers.removeLast());
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
    }
}
