package main.java.ex07;

import java.util.List;

public class Tree {
    private Node root;
    private class Node{
        private int data;
        private Node parent;
        private Node left;
        private Node right;
        public Node(int data){
            this.data=data;
            parent=null;
            left=null;
            right=null;
        }
        public Node getLeft(){
            return left;
        }
        public void setLeft(Node left){
            this.left= left;
        }
        public Node getRight(){
            return right;
        }
        public void setRight(Node right){
            this.right=right;
        }
        public void setData(int data){
            this.data=data;
        }
        public int getData(){
            return data;
        }
        public Node getParent(){
            return parent;
        }
        public void setParent(Node parent){
            this.parent= parent;
        }
    }
    private boolean find(int data){
        Node searchNode=root;
        while(searchNode!=null){
            if(searchNode.getData()==data){
                return true;
            }else if(searchNode.getData()>data){
                searchNode=searchNode.getRight();
            }else{
                searchNode=searchNode.getLeft();
            }
        }
        return false;
    }
    public boolean insert(int data){
        Node newNode=new Node(data);
        if(find(data)){
            return false;
        }else if(root==null){
            root=newNode;
            return true;
        }
        Node searchNode=root;
        Node parent;
        while(true){
            parent=searchNode;
            if(data<searchNode.getData()){
                searchNode=searchNode.getLeft();
                if(searchNode==null){
                    parent.setLeft(newNode);
                    return true;
                }
            }else{
                searchNode=searchNode.getRight();
                if(searchNode==null){
                    parent.setRight(newNode);
                    return true;
                }
            }
        }
    }
    private List<Integer> inOrderTraverse(Node focusNode, List<Integer> integers) {
        if (focusNode != null) {
            inOrderTraverse(focusNode.getLeft(),integers);
            integers.add(focusNode.getData());
            inOrderTraverse(focusNode.getRight(),integers);
        }
        return integers;
    }
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        System.out.println(tree);
    }
}
