package ex07;

public class LikeTree {
    private Node root;

    private class Node{
        int data;
        Node parent;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            parent = null;
            left = null;
            right = null;
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);
        Node cursor = this.root;

        //트리가 비어있을 때
        if(root == null){
            this.root = newNode;

        }
        else{   //트리에 1개 이상의 노드가 있을 때
            while(true){
                //커서가 가리키는 노드가 삽입될 노드보다 클때
                //커서를 트리 왼쪽으로 이동
                if(cursor.data > data){
                    if(cursor.left == null){
                        cursor.left = newNode;
                        break;
                    }
                    else{
                        cursor = cursor.left;
                    }
                }
                //커서가 가리키는 노드가 새 노드보다 작거나 같을때
                //커서를 트리 오른쪽으로 이동
                else {
                    if(cursor.right == null){
                        cursor.right = newNode;
                        break;
                    }
                    else{
                        cursor = cursor.right;
                    }
                }
            }
        }
    }
    public void delete(int data){
        Node parent = null;
        Node cursor = this.root;

        //커서가 삭제할 데이터를 찾거나 리프 노드에 닿을떄(더이상 가리킬 것이 없을때) 까지 이동
        while(cursor != null && cursor.data != data){
            parent = cursor;
            if(data < cursor.data){
                cursor = cursor.left;
            }
            else{
                cursor = cursor.right;
            }
        }

        //삭제할 데이터가 존재하지 않는다면
        if(cursor == null){
            System.out.println(data+" not exists");
        }

        //삭제할 노드가 자식이 없는 리프 노드인 경우(끝단)
        if(cursor.left == null && cursor.right == null){
            if(cursor != root){
                if(parent.left == cursor) {
                    parent.left = null;
                }
                else{
                    parent.right = null;
                }
            }
            else{
                root = null;
            }
        }

        // 삭제될 노드가 자식이 2개인 경우
        else if (cursor.left != null && cursor.right != null) {
            // 삭제될 노드와 그 부모노드 사이의 최솟값을 지닌 노드 탐색
            Node minValueNode = cursor.right;
            parent = cursor;
            while (minValueNode.left != null) {
                parent = minValueNode;
                minValueNode = minValueNode.left;
            }

            cursor.data = minValueNode.data;

            // 최솟값 노드를 삭제
            if (parent.left == minValueNode) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
//        //삭제할 노드가 자식이 2개인 경우
//        else if (cursor.left != null && cursor.right != null){
//            //삭제될 노드와 그 부모노드 사이의 최솟값을 지닌 노드 탐색
//            while (cursor != null) {
//                cursor = cursor.left;
//            }
//
//            Node temp = cursor;
//            int tempValue = temp.data;
//
//            //최솟값 노드를 삭제 후, 삭제될 노드에 최솟값 삽입
//            delete(temp.data);
//            cursor.data = tempValue;
//        }


        //삭제될 노드가 자식이 1개인 경우
        else{
            Node child = (cursor.left != null) ? cursor.left : cursor.right;

            if(cursor != root){
                if(cursor == parent.left){
                    parent.left = child;
                }
                else {
                    parent.right = child;
                }
            }
            else{
                root = child;
            }
        }
    }
    public void print(){
        printSubtree(root);
    }

    private void printSubtree(Node node){
        if(node == null){
            return;
        }
        else {
            printSubtree(node.left);
            System.out.print(node.data + " ");
            printSubtree(node.right);
        }
//
//        System.out.println(node.data+" ");
//
//        if (node.left != null) {
//            printSubtree(node.left);
//        }
//
//        if (node.right != null) {
//            printSubtree(node.right);
//        }

    }

    public static void main(String[] args) {
        LikeTree tree = new LikeTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(2);
        tree.insert(11);
        tree.print();

        System.out.println();
        tree.delete(5);
        tree.print();

    }

}
