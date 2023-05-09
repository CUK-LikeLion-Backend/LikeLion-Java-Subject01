package main.java.ex05;

import main.java.ex04.LikeList;
import org.w3c.dom.Node;

import java.util.Collection;

public class Stack extends main.java.ex05.LikeList {
   int top;
    private LikeList list;

    public LikeList getList() {
        return list;
    }
    public void push(int value){
        //게터세터...
    }
    public void pop(){

    }
    public void peek(){

    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else return false;
    }
    public boolean isFull(){
        if(isEmpty()){
            return false;
        }
        else
            return true;
    }
    public static void main(String[] args) {

    }
}
