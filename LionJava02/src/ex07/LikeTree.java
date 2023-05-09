package ex07;
public class LikeTree {
    private Node root;
    private class Node {
        int data ;
        Node parent;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            parent = null;
            left = null;
            right = null;
        }
    }
    // 삽입 메서드
    public void insert(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode ;
            return;
        }
        Node now = root;
        while (true) {
            if (data < now.data) {
                if (now.left == null) {
                    now.left = newNode;
                    newNode.parent = now;
                    return;
                }
                now = now.left;
            } else {
                if (now.right == null) {
                    now.right = newNode;
                    newNode.parent = now;
                    return;
                }
                now = now.right;
            }
        }



    }
    // 삭제 메서드
    public void delete(int data){

    }
    // 전체 노드 출력 메서드 중위순회
    public void print(){

    }
}
