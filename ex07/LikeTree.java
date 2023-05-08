package main.java.ex07;

public class LikeTree {
    private Node root;

    private class Node {
        int data;
        Node parent;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            parent = null;
            left = null;
            right = null;
        }
    }

    // 삽입 메서드
    public void insert(int data) {
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return;
        }
        Node tmp = root;
        while(true){
            if(tmp.data <= data && tmp.right != null){
                tmp = tmp.right;
            } else if(tmp.data > data && tmp.left != null){
                tmp = tmp.left;
            } else if(tmp.data <= data && tmp.right == null){
                tmp.right = newNode;
                newNode.parent = tmp;
                return;
            } else if(tmp.data > data && tmp.left == null){
                tmp.left = newNode;
                newNode.parent = tmp;
                return;
            }
        }

    }

    // 삭제 메서드
    public void delete(int data) {
        Node removeNode = root;

        // 빈 트리라면
        if(removeNode == null){
            return;
        }

        // 삭제할 노드 탐색
        while(removeNode != null && removeNode.data != data){
            if(removeNode.data < data){
                removeNode = removeNode.right;
            } else if(removeNode.data > data){
                removeNode = removeNode.left;
            }
        }

        // 삭제할 노드가 없다면
        if(removeNode == null){
            System.out.println("삭제할 노드가 존재하지 않습니다.");
            return;
        }

        Node ParentNode = removeNode.parent;
        // 자식 노드가 없을 때
        if(removeNode.left == null && removeNode.right == null) {
            // 삭제할 노드의 부모 노드의 link 필드 null로 변경
            if(ParentNode.data < removeNode.data){
                ParentNode.right = null;
            } else {
                ParentNode.left = null;
            }

        }

        // 자식 노드가 하나일 때
        else if(removeNode.left == null || removeNode.right == null){
            // 삭제할 노드의 자식 노드와 부모 노드를 잇는 과정
            if(removeNode.left == null && (ParentNode.data <= removeNode.data)){
                ParentNode.right = removeNode.right;
            } else if(removeNode.left == null && (ParentNode.data > removeNode.data)){
                ParentNode.left = removeNode.right;
            } else if(removeNode.right == null && (ParentNode.data <= removeNode.data)){
                ParentNode.right = removeNode.left;
            } else if(removeNode.right == null && (ParentNode.data > removeNode.data)){
                ParentNode.left = removeNode.left;
            }
        }
        // 자식 노드가 둘 다일 때
        else{
            // 오른쪽 서브 트리에서 최솟값 노드 찾기
            Node tmpMin = removeNode.right;

            while(tmpMin.left != null){
                tmpMin = tmpMin.left;
            }
            removeNode.data = tmpMin.data;

            // 지울 노드의 바로 오른쪽 노드가 최솟값 노드일 때
            if(tmpMin == removeNode.right){
                removeNode.right = tmpMin.right;
                return;
            }

            tmpMin.parent.left = tmpMin.right;
            return;
        }
        return;
    }

    // 전체 노드 출력 메서드
    public void print(Node tmp) {
        // 전위 순회
        if(tmp == null){
            return;
        }
        System.out.printf("%d ", tmp.data);
        if(tmp.left != null) {
            print(tmp.left);
        }
        if(tmp.right != null) {
            print(tmp.right);
        }

        return;
    }

    public static void main(String[] args) {
        LikeTree tree = new LikeTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(5);
        tree.insert(6);
        tree.insert(4);
        tree.print(tree.root);
        System.out.println();

        // 자식 노드가 없는 노드 삭제
        tree.delete(6);
        tree.print(tree.root);
        System.out.println();

        // 자식 노드가 둘인 노드 삭제
        tree.delete(3);
        tree.print(tree.root);
        System.out.println();

        // 존재하지 않는 노드 삭제
        tree.delete(3); // 존재하지 않는 노드
        tree.print(tree.root); // 그대로임
        System.out.println();

        // 자식 노드가 하나인 노드 삭제
        tree.delete(1);
        tree.print(tree.root);
        System.out.println();
    }
}
