package ex05;


public class LikeStack{
    private LikeList list;
    public LikeStack(){
        list = new LikeList();
    }



    //추가
    public void push(int value){
        list.insert(0, value);
    }
    //삭제
    public void pop(){
        list.delete(0);

    }

    //스택의 마지막 값 조회
    public int peek(){
        return list.Peek();
    }

    //스택이 비어있다면 true
    public boolean isEmpty(){
        if(list.getHead() != null)
            return false;
        return true;

    }

}
class Test{
    public static void main(String[] args) {
        LikeStack ls = new LikeStack();
        ls.push(1);
        ls.push(2);
        ls.push(3);
        System.out.print(ls.peek()+" ");
        ls.pop();
        System.out.print(ls.peek());


    }


}
