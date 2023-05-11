package ex05;

public class LikeStack {

    private LikeList list;

    public LikeStack(){
        list = new LikeList();

    }
    //스택의 맨 위에 추가(리스트의 맨 앞) ->리스트의 인덱스 0위치에 삽입

    public void push(int value){

        list.insert(0, value);
    }
    public void pop(){
        list.delete(0);
        //마지막으로 추가된 노드가 맨 앞에 위치하므로
        //인덱스 0 노드 삭제
    }
    public int peek(){  //스택의 마지막 값 조회
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        return list.getData(list.get(0));
    }
    public boolean isEmpty(){

        return list.size() == 0;
    }
    public void print(){
        list.print();
    }

    public static void main(String[] args) {
        LikeStack likeStack=new LikeStack();
        likeStack.push(3);
        System.out.println(likeStack.peek());
        likeStack.push(5);
        System.out.println(likeStack.peek());
        likeStack.push(6);
        System.out.println(likeStack.peek());
        likeStack.pop();
        System.out.println(likeStack.peek());
        System.out.println(likeStack.isEmpty());
        likeStack.print();
    }
}
