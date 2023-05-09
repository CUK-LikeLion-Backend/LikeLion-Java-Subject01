package main.java.ex07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LikeTree {
    private Node root;
    class Node{
        int data;
        Node parent;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            parent=null;
            left=null;
            right=null;
        }
    }
    //root 생성. 이후 데이터 삽입시 루트와 배교해 오른쪽 혹은 왼쪽으로 분배. (이 부분을 재귀한다.)
    public void search(Node node,int data,int left,int right){
        if(node==null){
            return;
        }else if(node.data==data){
            if(left != -1){
                node.left=new Node(left);
            }else if(right != -1){
                node.right=new Node(right);
            }else{
                search(node.left,data,left,right);
                search(node.right,data,left,right);
            }
        }
    }
    public void preOrder(Node node){
        if(node !=null){
            System.out.println(node.data+" ");
            if(node.left !=null)preOrder(node.left);
            if(node.right !=null)preOrder(node.right);
        }
    }
    public void insert(int data,int left,int right){

        if(root==null){
            root=new Node(data);
            if(left != -1){
                root.left=new Node(left);
            }
            else if(right !=-1){
                root.right=new Node(right);
            }else{
                search(root,data,left,right);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LikeTree t=new LikeTree();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            t.insert(a,b,c);
        }
        t.preOrder(t.root);
    }

}
